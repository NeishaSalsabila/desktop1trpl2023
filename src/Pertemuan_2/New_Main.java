/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class New_Main {
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame j = new JFrame("JFrame Pertamaku");
        
        JLabel username = new JLabel ();
        username.setText("Username");
        username.setBounds(30, 30, 100, 30);
        j.add(username);
        
        JLabel password = new JLabel ();
        password.setText("Password");
        password.setBounds(30, 65, 100, 30);
        j.add(password);
        
        JTextField usernameTxt = new JTextField ();
        usernameTxt.setBounds(110, 30,  250, 30);
        j.add(usernameTxt);
        
        JTextField passwordTxt = new JTextField ();
        passwordTxt.setBounds(110, 65, 250, 30);
        j.add(passwordTxt);
        
        JButton loginButton = new JButton ();
        loginButton.setText("Login");
        loginButton.setBounds(250, 120, 100, 30);
        j.add(loginButton);
        
        j.setSize(500, 500);
        j.setLayout(null);
        j.setVisible(true);
    }
    
}
