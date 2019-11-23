package db_javafx;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SearchController implements Initializable {
	private PersonQueries queries;
	
	@FXML
	private TextArea taInfo;
	@FXML
	private TextField tfFind;
	
	
	@FXML
	private void findButtonAction(ActionEvent event) {
		System.out.println("fffffffffffffffffff");
		List<Person> people = queries.getPeopleByLastName(tfFind.getText());
		System.out.println(tfFind.getText());
		if(people.size() > 0) {
			taInfo.setText(people.get(0).toString());
		}else {
			taInfo.setText("no entries were found");
		}
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	public void passQueriesObject(PersonQueries queries) {
		this.queries = queries;
		
	}

}
