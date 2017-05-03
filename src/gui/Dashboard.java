package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Dashboard extends JFrame {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private JPanel contentPane;

  /**
   * Create the frame.
   */
  public Dashboard() {
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 750, 700);

    JMenuBar menuBar = new JMenuBar();
    setJMenuBar(menuBar);

    JMenuItem mntmInfo = new JMenuItem("Info");
    mntmInfo.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        JOptionPane.showMessageDialog(contentPane, "Info will be added here!");
      }
    });
    menuBar.add(mntmInfo);

    JMenuItem mntmSettings = new JMenuItem("Settings");
    menuBar.add(mntmSettings);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JToolBar toolBar = new JToolBar();
    toolBar.setToolTipText("");
    toolBar.setBounds(0, 0, 744, 34);
    contentPane.add(toolBar);

    JButton btnHome = new JButton("Home");
    toolBar.add(btnHome);

    JButton btnAccount = new JButton("Account");
    toolBar.add(btnAccount);

    JPanel panel = new JPanel();
    panel.setBorder(null);
    panel.setBounds(0, 45, 178, 603);
    contentPane.add(panel);
    GridBagLayout gbl_panel = new GridBagLayout();
    gbl_panel.columnWidths = new int[] { 0, 0, 0, 0 };
    gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0 };
    gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
    gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
    panel.setLayout(gbl_panel);

    JButton btnTransaction = new JButton("Transaction");
    GridBagConstraints gbc_btnTransaction = new GridBagConstraints();
    gbc_btnTransaction.insets = new Insets(0, 0, 5, 5);
    gbc_btnTransaction.gridx = 0;
    gbc_btnTransaction.gridy = 1;
    panel.add(btnTransaction, gbc_btnTransaction);

    JButton btnBillPay = new JButton("Bill Payments");
    GridBagConstraints gbc_btnBillPay = new GridBagConstraints();
    gbc_btnBillPay.insets = new Insets(0, 0, 5, 5);
    gbc_btnBillPay.gridx = 0;
    gbc_btnBillPay.gridy = 2;
    panel.add(btnBillPay, gbc_btnBillPay);

    JSeparator separator_1 = new JSeparator();
    GridBagConstraints gbc_separator_1 = new GridBagConstraints();
    gbc_separator_1.gridwidth = 3;
    gbc_separator_1.insets = new Insets(0, 0, 0, 5);
    gbc_separator_1.gridx = 0;
    gbc_separator_1.gridy = 3;
    panel.add(separator_1, gbc_separator_1);

    JPanel panel_1 = new JPanel();
    panel_1.setBorder(null);
    panel_1.setBounds(188, 45, 556, 603);
    contentPane.add(panel_1);

    JSeparator separator = new JSeparator();
    separator.setOrientation(SwingConstants.VERTICAL);
    separator.setBounds(182, 32, 8, 616);
    contentPane.add(separator);
  }
}
