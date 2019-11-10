package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class ListviewController implements Initializable {

	@FXML
	Label lblSelectedDay;

	@FXML
	Label lblSelectedMonth;

	@FXML
	Button btnShow;

	@FXML
	ListView<String> daysList;

	private final ObservableList<Month> months = FXCollections.observableArrayList();

	@FXML
	private ListView<Month> monthsListView;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		daysList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		
		months.add(new Month(1, "January"));
		months.add(new Month(2, "February"));
		months.add(new Month(3, "March"));
		months.add(new Month(4, "April"));
		months.add(new Month(5, "May"));
		months.add(new Month(6, "June"));
		months.add(new Month(7, "July"));
		months.add(new Month(8, "August"));
		months.add(new Month(9, "September"));
		months.add(new Month(10, "October"));
		months.add(new Month(11, "November"));
		months.add(new Month(12, "December"));
		monthsListView.setItems(months);

		monthsListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Month>() {
			@Override
			public void changed(ObservableValue<? extends Month> ov, Month oldValue, Month newValue) {
				lblSelectedMonth.setText("MONTH: " + newValue.getMonthName());
			}
		});
	}

	@FXML
	private void handleShowButtonEvend(ActionEvent event) {
		ObservableList<String> selectedItemsList = daysList.getSelectionModel().getSelectedItems();
		lblSelectedDay.setText("DAY: " + selectedItemsList.get(0));
	}
}
