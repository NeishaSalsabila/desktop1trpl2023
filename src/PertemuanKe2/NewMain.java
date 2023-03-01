package PertemuanKe2;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class NewMain {
    public static void main(String[] args) {
        JFrame j=new JFrame("JFrame Pertamaku"); //creating instance of JFrame  
        
        JLabel username = new JLabel();
        username.setText("Username");
        username.setBounds(50, 100, 100, 30); //x axis, y axis, width, height  
        j.add(username); //adding button in JFrame 
        
        JLabel password = new JLabel();
        password.setText("Password");
        password.setBounds(50, 150, 100, 30); //x axis, y axis, width, height  
        j.add(password); //adding button in JFrame 
        
        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(150, 100, 200, 30);//x axis, y axis, width, height  
        j.add(usernameTxt);//adding button in JFrame  
        
        JPasswordField passwordTxt = new JPasswordField();
        passwordTxt.setBounds(150, 150, 200, 30);//x axis, y axis, width, height  
        j.add(passwordTxt);//adding button in JFrame  
        
        JButton loginButton = new JButton();
        loginButton.setText("Login");
        loginButton.setBounds(150, 200, 100, 30);//x axis, y axis, width, height  
        j.add(loginButton);//adding button in JFrame
        
        JTextArea testTxt = new JTextArea();
        testTxt.setBounds(150, 260, 200, 200);
        j.add(testTxt);
        
        j.setSize(800, 800); //width and height  
        j.setLayout(null); //using no layout managers  
        j.setVisible(true); //making the frame visible  
    }   
}
