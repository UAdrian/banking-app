package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DashboardController {
  @FXML
  private Label userLbl;

  public void logOut(ActionEvent event) throws Exception {
    ((Node) event.getSource()).getScene().getWindow().hide();
    Stage primaryStage = new Stage();
    FXMLLoader loader = new FXMLLoader();
    Pane root = loader.load(getClass().getResource("/application/Login.fxml").openStream());
    Scene scene = new Scene(root);
    scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
