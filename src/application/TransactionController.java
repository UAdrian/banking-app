package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.mkyong.common.App;

import classes.Account;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TransactionController implements Initializable {
	@FXML
	private TextField sendAcc;
	@FXML
	private TextField sum;
	@FXML
	private TextField acc;
	@FXML
	private Button done;
	@FXML
	private Label status;

	public void transfer(ActionEvent event) {
		if (acc.getText().isEmpty()) {
			status.setText("Invalid account number!");
			done.setDisable(true);
		} else {
			if (App.acess(acc.getText()).getCustId().isEmpty()) {
				status.setText("Invalid account number!");
			} else {
				App.transfer(Account.getCustId(), acc.getText(), Double.parseDouble(sum.getText()));
				status.setText("Transfer succesfull!");
				new Account(App.acess(Account.getCustId()));
				App.
			}
		}
		if (sum.getText().isEmpty()) {
			status.setText("Amount to be sent is empty!");
			done.setDisable(true);
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		sendAcc.setText(Account.getCustId());
		sum.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (!newValue.matches("\\d*")) {
					sum.setText(newValue.replaceAll("[^\\d]", ""));
				}
				if (!sum.getText().isEmpty()) {
					done.setDisable(false);
					status.setText("");
				}
			}
		});

		acc.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				if (acc.getText().equals(Account.getCustId())) {
					status.setText("You can't send money to yourself!");
					done.setDisable(true);
				} else {
					done.setDisable(false);
					status.setText("");
				}

				int maxLength = 19;
				if (acc.getText().length() > maxLength) {
					String s = acc.getText().substring(0, maxLength);
					acc.setText(s);
				}
			}
		});
	}
}
