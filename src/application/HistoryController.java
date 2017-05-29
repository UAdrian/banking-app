package application;

import java.net.URL;
import java.util.ResourceBundle;

import classes.History;
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

  public ObservableList<History> list = FXCollections.observableArrayList(new History("27.02.2017", "1250 RON"),
      new History("27.02.2017", "125 RON"), new History("27.02.2017", "130 RON"), new History("27.02.2017", "130 RON"));

  @Override
  public void initialize(URL arg0, ResourceBundle arg1) {
    data.setCellValueFactory(new PropertyValueFactory<History, String>("date"));
    details.setCellValueFactory(new PropertyValueFactory<History, String>("details"));
    table.setItems(list);
  }

}
