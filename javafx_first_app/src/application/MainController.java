package application;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController implements Initializable{
	   @FXML
	    private Label lblName;
	   @FXML
	    private TextField txtName;
	   
	   private Student student;
	   
	   
	   
	   
	
	@FXML
    private void handleButtonAction(ActionEvent event) {
		
        System.out.println("You clicked me!");
    	lblName.setText("111");
    	String name = txtName.getText();
    	System.out.println(name);
    	student.setFirstName(name);
    	System.out.println("1111111 " + student.getFirstName());
    	
    	openSecondWindow();
    }
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		lblName.setText("555555555555555555555");
		student = new Student();
	}
	
	private void openSecondWindow() {
		try {
			Stage stage = new Stage();
		
			String fxmlFileName = "SecondWindow.fxml";
			FXMLLoader loader = new  FXMLLoader(getClass().getResource(fxmlFileName));
			Parent root = loader.load();
		
			SecondWindowController controller = loader.<SecondWindowController>getController();
			System.out.println(controller);
			System.out.println(student);
			controller.passData(student);
			Scene scene = new Scene(root,800,400);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
