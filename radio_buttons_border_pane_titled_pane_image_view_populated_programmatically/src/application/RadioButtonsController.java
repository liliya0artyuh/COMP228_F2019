package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class RadioButtonsController implements Initializable{

	@FXML
	private Label label;
	
	@FXML
	private RadioButton greenRadioButton;
	@FXML
	private RadioButton redRadioButton;
	@FXML
	private RadioButton yellowRadioButton;

	@FXML
	private RadioButton fruitRadioButton;
	@FXML
	private RadioButton vegetableRadioButton;

	@FXML
	private ToggleGroup colorToggleGroup;
	@FXML
	private ToggleGroup itemToggleGroup;
	
	@FXML
	private ImageView imageView;

	private Color imageColor;
	private Item item;
	

	@FXML
	private void colorRadioButtonSelected(ActionEvent e) {
		imageColor = (Color) colorToggleGroup.getSelectedToggle().getUserData();
	}

	@FXML
	private void itemRadioButtonSelected(ActionEvent e) {
		item = (Item) itemToggleGroup.getSelectedToggle().getUserData();
	}
	
	
	
	@FXML
	private void displayImage() throws Exception {

		System.out.println("TTTTTTTT button click works!");
		System.out.println("imageColor " + imageColor);
		System.out.println("item " + item );
		
		if(imageColor == Color.GREEN && item.equals(Item.VEGETABLE)) {
			label.setText(" green vegetable");
			imageView.setImage(new Image("/application/images/cucumber.png"));  
		}	else if(imageColor == Color.GREEN && item.equals(Item.FRUIT)) {
			label.setText(" green fruit");
			imageView.setImage(new Image("/application/images/banana.png"));  
		}else if(imageColor == Color.RED && item.equals(Item.FRUIT)) {
			imageView.setImage(new Image("/application/images/red_apple.png"));  
			label.setText(" red fruit");
		}else if(imageColor == Color.RED && item.equals(Item.VEGETABLE)) {
			imageView.setImage(new Image("/application/images/tomato.png"));  
			label.setText(" red vegetable");
		}else if(imageColor == Color.YELLOW && item.equals(Item.VEGETABLE)) {
			imageView.setImage(new Image("/application/images/yellow_squash.png"));  
			label.setText(" yellow vegetable");
		}else if(imageColor == Color.YELLOW && item.equals(Item.FRUIT)) {
			imageView.setImage(new Image("/application/images/yellow_apple.png"));  
			label.setText(" yellow fruit");
		}else {
			imageView.setImage(new Image("/application/images/default.png"));  
			label.setText("?????");

		}
	}



	@Override
	public void initialize(URL location, ResourceBundle resources) {
		greenRadioButton.setUserData(Color.GREEN);
		redRadioButton.setUserData(Color.RED);
		yellowRadioButton.setUserData(Color.YELLOW);
		
		fruitRadioButton.setUserData(Item.FRUIT);
		vegetableRadioButton.setUserData(Item.VEGETABLE);
	}
}
