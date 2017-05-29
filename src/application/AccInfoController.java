package application;

import java.net.URL;
import java.util.ResourceBundle;

import classes.Account;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class AccInfoController implements Initializable {

  @FXML
  private TextField type;
  @FXML
  private TextField number;
  @FXML
  private TextField balance;
  @FXML
  private TextField email;

  @Override
  public void initialize(URL arg0, ResourceBundle arg1) {
    type.setText(Account.getType());
    number.setText(Account.getNumber());
    balance.setText(Account.getBalance() + " RON");
    email.setText("something@yahhoo.com");
  }

}
