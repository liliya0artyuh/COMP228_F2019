package db_javafx;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class ViewController implements Initializable {
	
	private PersonQueries queries;
	
	private final ObservableList<Person> people = FXCollections.observableArrayList();

	@FXML
	private ListView<Person> peopleListView;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {	

	}

	public void passQueriesObject(PersonQueries queries) {
		this.queries = queries;
		
		
		List<Person> ppl = this.queries.getAllPeople();
		
		for(Person person : ppl) {
			people.add(person);
		}
		
		peopleListView.setItems(people);
		
	}

}
