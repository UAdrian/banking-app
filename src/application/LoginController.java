package application;

import com.mkyong.common.App;
import com.mkyong.customer.model.Customer;

import classes.Account;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class LoginController {
	@FXML
	private Label lblStatus;

	@FXML
	private TextField txtUsername;

	@FXML
	private TextField txtPassword;
	Customer accountOwner;

	public void login(ActionEvent event) throws Exception {
		accountOwner = App.acess(txtUsername.getText());
		if (txtUsername.getText().equals(accountOwner.getCustId())
				&& txtPassword.getText().equals(accountOwner.getPassword())) {
			new Account(accountOwner);
			((Node) event.getSource()).getScene().getWindow().hide();
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/Dashboard.fxml"));
			((Region) root).setPadding(new Insets(5, 5, 5, 5));
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
