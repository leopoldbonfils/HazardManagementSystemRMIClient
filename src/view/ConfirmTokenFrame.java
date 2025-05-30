/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.*;
import java.awt.event.*;
import java.rmi.Naming;
import service.UserService;

/**
 *
 * @author HP
 */
public class ConfirmTokenFrame extends JFrame{
    private JTextField tokenField;
    private JButton confirmButton;

    public ConfirmTokenFrame() {
        setTitle("Confirm Your Email");
        setSize(400, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel tokenLabel = new JLabel("Enter your confirmation token:");
        tokenLabel.setBounds(20, 20, 250, 25);
        add(tokenLabel);

        tokenField = new JTextField();
        tokenField.setBounds(20, 50, 240, 25);
        add(tokenField);

        confirmButton = new JButton("Confirm");
        confirmButton.setBounds(270, 50, 90, 25);
        add(confirmButton);

        confirmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String token = tokenField.getText();
                try {
                    UserService userService = (UserService) Naming.lookup("rmi://localhost:1099/UserService");
                    boolean confirmed = userService.confirmUser(token);
                    if (confirmed) {
                        JOptionPane.showMessageDialog(null, "Account confirmed successfully!");

                        // Fungura login page
                        dispose(); // Funga confirmation window
                        new Login().setVisible(true); // Jyana kuri login page

                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid or expired token.");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error confirming account.");
                }
            }
        });
    }
     public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ConfirmTokenFrame().setVisible(true);
            }
        });
    }
    
}
