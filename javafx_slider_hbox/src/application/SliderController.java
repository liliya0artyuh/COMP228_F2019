package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;

public class SliderController implements Initializable {


	   @FXML
	   private Slider numberOneSlider;
	   @FXML
	   private Slider numberTwoSlider;
	   
	   @FXML
	   private Label lblNumberOne = new Label();
	   @FXML
	   private Label lblNumberTwo = new Label();
	   
	   @FXML
	   private TextArea twoNumbersDisplay;
	   
	  
	   @FXML
	   public void handleButtonAction() {
			   twoNumbersDisplay.setText(
					   String.format(
							   "number two is %d, %nnumber one is %d, %nsum is %d",
							   (int) numberTwoSlider.getValue(),
							   (int) numberOneSlider.getValue(),
							   (int) numberTwoSlider.getValue() +(int) numberOneSlider.getValue()
							   )
					   );
		   }
	   
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		lblNumberTwo.setText("number two: " + (int) numberTwoSlider.getValue());
    	lblNumberOne.setText("number one: " + (int) numberOneSlider.getValue());

		numberOneSlider.valueProperty().addListener(
	         new ChangeListener<Number>() {
	            @Override
	            public void changed(ObservableValue<? extends Number> ov, 
	               Number oldValue, Number newValue) {
	            	lblNumberOne.setText("number one: " + newValue.intValue());
	            }
	         }
	      );
		
		numberTwoSlider.valueProperty().addListener(
	         new ChangeListener<Number>() {
	            @Override
	            public void changed(ObservableValue<? extends Number> ov, 
	               Number oldValue, Number newValue) {
	            	lblNumberTwo.setText("number two: " + newValue.intValue());
	            }
	         }
	      );
	}

}
