package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.mkyong.common.App;
import com.mkyong.customer.model.History;

import classes.Account;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class HistoryController implements Initializable {
	@FXML
	private TableView<History> table;
	@FXML
	private TableColumn<History, String> data;
	@FXML
	private TableColumn<History, String> details;

	public ObservableList<History> list = FXCollections.observableArrayList();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		list.addAll(App.getHistory(Account.getCustId()));
		data.setCellValueFactory(new PropertyValueFactory<History, String>("date"));
		details.setCellValueFactory(new PropertyValueFactory<History, String>("details"));
		table.setItems(list);
	}

}
