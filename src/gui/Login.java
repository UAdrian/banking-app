package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {

  private JFrame frmLogin;
  private JTextField textField;
  private JPasswordField passwordField;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Login window = new Login();
          window.frmLogin.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public Login() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frmLogin = new JFrame();
    frmLogin.setTitle("Login");
    frmLogin.setResizable(false);
    frmLogin.setBounds(100, 100, 450, 260);
    frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frmLogin.getContentPane().setLayout(null);

    JLabel lblUsername = new JLabel("Username");
    lblUsername.setBounds(28, 39, 108, 35);
    frmLogin.getContentPane().add(lblUsername);

    JLabel lblPassword = new JLabel("Password");
    lblPassword.setBounds(28, 85, 108, 35);
    frmLogin.getContentPane().add(lblPassword);

    textField = new JTextField();
    textField.setBounds(146, 47, 216, 28);
    frmLogin.getContentPane().add(textField);
    textField.setColumns(10);

    passwordField = new JPasswordField();
    passwordField.setBounds(146, 92, 216, 28);
    frmLogin.getContentPane().add(passwordField);

    JButton btnLogin = new JButton("Login");
    btnLogin.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        String uName = textField.getText();
        @SuppressWarnings("deprecation")
        String pass = passwordField.getText();

        if (uName.contentEquals("asd") && pass.contentEquals("123")) {
          JOptionPane.showMessageDialog(frmLogin, "Succesfuly logged in!");
          frmLogin.dispose();
          Dashboard dash = new Dashboard();
          dash.setVisible(true);
        } else {
          JOptionPane.showMessageDialog(frmLogin, "Invalid username or password!");
        }
      }
    });
    btnLogin.setBounds(146, 148, 89, 23);
    frmLogin.getContentPane().add(btnLogin);
  }
}
