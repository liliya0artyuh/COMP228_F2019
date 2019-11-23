package db_javafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuController implements Initializable {
	private PersonQueries queries = new PersonQueries();
	
	
	@FXML
	private void handleButtonAction(ActionEvent event) {
		System.out.println("11111111111111");
		try {
		Stage stage = new Stage();
		String fxmlFileName = "ViewWindow.fxml";
		FXMLLoader loader = new  FXMLLoader(getClass().getResource(fxmlFileName));
		Parent root;
		root = loader.load();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		ViewController controller = loader.<ViewController>getController();
		controller.passQueriesObject(queries);
		stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@FXML
	private void searchButtonAction(ActionEvent event) {
		System.out.println("22222222222222");
		try {
		Stage stage = new Stage();
		String fxmlFileName = "SearchWindow.fxml";
		FXMLLoader loader = new  FXMLLoader(getClass().getResource(fxmlFileName));
		Parent root;
		root = loader.load();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		SearchController controller = loader.<SearchController>getController();
		controller.passQueriesObject(queries);
		stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {


	}

}
