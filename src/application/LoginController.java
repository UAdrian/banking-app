package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
  @FXML
  private Label userLbl;

  @FXML
  private Label lblStatus;

  @FXML
  private TextField txtUsername;

  @FXML
  private TextField txtPassword;

  public void login(ActionEvent event) throws Exception {
    if (txtUsername.getText().equals("user") && txtPassword.getText().equals("user")) {
      ((Node) event.getSource()).getScene().getWindow().hide();
      Stage primaryStage = new Stage();
      Parent root = FXMLLoader.load(getClass().getResource("/application/Dashboard.fxml"));
      Scene scene = new Scene(root);
      scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
      primaryStage.setTitle("Dashboard");
      primaryStage.setScene(scene);
      primaryStage.show();
    } else {
      lblStatus.setText("Username or password is incorrect");
    }
  }

  public void forgotPassword(ActionEvent event) {
    // TO-DO handle pass
    lblStatus.setText("Not yet implemented");
  }
}
