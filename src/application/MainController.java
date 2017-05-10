package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {
  @FXML
  private Label lblStatus;

  @FXML
  private TextField txtUsername;

  @FXML
  private TextField txtPassword;

  public void login(ActionEvent event) throws Exception {
    if (txtUsername.getText().equals("user") && txtPassword.getText().equals("user")) {
      lblStatus.setText("Login success");
      Stage primaryStage = new Stage();
      Parent root = FXMLLoader.load(getClass().getResource("/application/Dashboard.fxml"));
      Scene scene = new Scene(root, 300, 300);
      scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
      primaryStage.setScene(scene);
      primaryStage.show();
    } else {
      lblStatus.setText("Login failed");
    }
  }
}
