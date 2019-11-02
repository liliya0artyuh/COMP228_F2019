package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SecondWindowController implements Initializable {
	private Student student;
	   @FXML
	    private TextArea txaInfo;
	
	public void passData(Student currentStudent) {
		student = currentStudent;
		System.out.println("33333 ");
		System.out.println("rrrrrrrrr " + currentStudent.getFirstName());
		
		System.out.println("33333 ");
		System.out.println("gggggg " + student.getFirstName());
		
		System.out.println("kkkkkk " + student);
		txaInfo.setText(student.getFirstName());
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

}
