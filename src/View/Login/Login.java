/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Login;

import Controller.ControllerAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class Login extends JFrame{
    ControllerAdmin controller;
    JLabel title = new JLabel("Login Page");
    JLabel unameLabel = new JLabel("Username");
    JLabel passLabel = new JLabel("Password");
    JTextField usernameInput = new JTextField();
    JPasswordField passwordInput = new JPasswordField();
    JButton loginButton = new JButton("Login");
    
    public Login(){
        setTitle("Loginpage");
        setVisible(true);
        setSize(480, 360);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(title);
        add(unameLabel);
        add(passLabel);
        add(usernameInput);
        add(passwordInput);
        add(loginButton);
        
        title.setBounds(20,12,440,36);
        unameLabel.setBounds(80,56,320,40);
        usernameInput.setBounds(80,90,320,40);
        passLabel.setBounds(80,140,320,40);
        passwordInput.setBounds(80,180,320,40);
        loginButton.setBounds(80, 260, 160, 30);
        
        controller = new ControllerAdmin(this);
        
        loginButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.loginuser();
            }
        
        });
        
    }
    
    
    
    public String getinputUsername(){
            return usernameInput.getText();
    }
    
    public String getinputPassword(){
        char[] pass = passwordInput.getPassword();
        String password = String.valueOf(pass);
            return password;
    }
}
