package prep_statements_example;

//Fig. 24.31: PersonQueries.java
//PreparedStatements used by the Address Book application.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class PersonQueries {
	private static final String URL = "jdbc:derby:address";
	private static final String USERNAME = "lil";
	private static final String PASSWORD = "lil";

	private Connection connection; // manages connection
	private PreparedStatement selectAllPeople;
	private PreparedStatement selectPeopleByLastName;
	private PreparedStatement insertNewPerson;
	private PreparedStatement deletePerson;

// constructor
	public PersonQueries() {
		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			// create query that selects all entries in the AddressBook
			selectAllPeople = connection.prepareStatement("SELECT * FROM authors ORDER BY LastName, FirstName");

			// create query that selects entries with last names
			// that begin with the specified characters
			selectPeopleByLastName = connection.prepareStatement(
					"SELECT * FROM authors WHERE LastName LIKE ? ORDER BY LastName, FirstName");

			// create insert that adds a new entry into the database
			insertNewPerson = connection.prepareStatement(
					"INSERT INTO authors  (FirstName, LastName) VALUES (?, ?)");
			
			deletePerson = connection.prepareStatement(
					"DELETE FROM authors WHERE LastName=?");
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			System.exit(1);
		}
	}

// select all of the addresses in the database
	public List<Person> getAllPeople() {
		// executeQuery returns ResultSet containing matching entries
		try (ResultSet resultSet = selectAllPeople.executeQuery()) {
			List<Person> results = new ArrayList<Person>();

			while (resultSet.next()) {
				Person person = new Person(resultSet.getInt("authorID"), resultSet.getString("FirstName"),
						resultSet.getString("LastName"));
				
				results.add(person);
			}

			return results;
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}

		return null;
	}

// select person by last name
	public List<Person> getPeopleByLastName(String lastName) {
		try {
			selectPeopleByLastName.setString(1, lastName); // set last name
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			return null;
		}

		// executeQuery returns ResultSet containing matching entries
		try (ResultSet resultSet = selectPeopleByLastName.executeQuery()) {
			List<Person> results = new ArrayList<Person>();

			while (resultSet.next()) {
				results.add(new Person(resultSet.getInt("authorID"), resultSet.getString("FirstName"),
						resultSet.getString("LastName")));
			}

			return results;
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			return null;
		}
	}

// add an entry
	public int addPerson(String firstName, String lastName) {

		// insert the new entry; returns # of rows updated
		try {
			// set parameters
			insertNewPerson.setString(1, firstName);
			insertNewPerson.setString(2, lastName);

			return insertNewPerson.executeUpdate();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			return 0;
		}
	}
	
	public int deletePerson(String lastName) {

		// insert the new entry; returns # of rows updated
		try {
			// set parameters
			deletePerson.setString(1, lastName);

			return deletePerson.executeUpdate();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			return 0;
		}
	}

// close the database connection
	public void close() {
		try {
			connection.close();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}
	}
}
