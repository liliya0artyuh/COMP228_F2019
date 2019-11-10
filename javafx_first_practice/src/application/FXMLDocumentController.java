package application;

import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import application.model.Hospital;
import application.model.Name;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblName;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtSurname; 
    @FXML
   private TextArea txtAInfo;
        
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        lblName.setText("Hello World!");
        
        Hospital h = new Hospital();
        
        Name name = new Name();
        name.setPatientLastName(txtSurname.getText());
        name.setPatientName(txtName.getText());
        
        h.setName(name);
        
        
        txtAInfo.setText( h.getName().getPatientName() + " " + h.getName().getPatientLastName());
    }
    

	@Override
	public void initialize(java.net.URL arg0, ResourceBundle arg1) {		
	}    
    
}