package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class MainController implements Initializable {

	@FXML 
	private ToggleGroup genderToggle;
	
	@FXML 
	private Label lblGender;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	
	@FXML
	public void handleButtonClick(ActionEvent e) {
		lblGender.setText(((RadioButton)genderToggle.getSelectedToggle()).getText());
	}

}
