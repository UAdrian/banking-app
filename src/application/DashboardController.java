package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DashboardController implements Initializable {
  @FXML
  private Label userLbl;
  @FXML
  private BorderPane accInfo;
  @FXML
  private Stage window;

  public void logOut(ActionEvent event) throws Exception {
    ((Node) event.getSource()).getScene().getWindow().hide();
    window = new Stage();
    Pane root = FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
    Scene scene = new Scene(root);
    scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    window.setScene(scene);
    window.show();
  }

  public void goAccountInfo(ActionEvent event) throws Exception {
    accInfo = (BorderPane) FXMLLoader.load(getClass().getResource("/application/Dashboard.fxml"));
    Pane center = (Pane) FXMLLoader.load(getClass().getResource("/application/AccInfo.fxml"));
    accInfo.setPadding(new Insets(5, 5, 5, 5));
    accInfo.setCenter(center);
    ((Node) event.getSource()).getScene().setRoot(accInfo);
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    userLbl.setText("Welcome user!");
  }

}