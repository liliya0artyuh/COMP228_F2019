package prep_statements_example;

import java.util.List;

public class Driver {

	public static void main(String[] args) {
		PersonQueries queries = new PersonQueries();
		List<Person> people ;
		/*
		 *  people = queries.getAllPeople();
		 * 
		 * for (Person person : people) { System.out.println(person.toString()); }
		 * 
		 * int result = queries.addPerson("5555555555", "555555555555555");
		 * 
		 * System.out.println("result of adding  " + result);
		 * 
		 * 
		 * people = queries.getAllPeople(); for (Person person : people) {
		 * System.out.println(person.toString()); }
		 * 
		 */
		
		//people = queries.getPeopleByLastName("555555555555555");
		
		  int result = queries.deletePerson("555555555555555");
		  System.out.println("result of deleting  " + result);
		  
		  
		people = queries.getAllPeople();
		for (Person person : people) {
			System.out.println(person.toString());
		}
		
	}

}
