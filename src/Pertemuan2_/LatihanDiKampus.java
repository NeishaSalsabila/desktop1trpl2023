/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2_;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class LatihanDiKampus {
    public static void main(String[] args) {
        JFrame j=new JFrame("JFrame Pertamaku"); //creating instance of JFrame  
        
        JLabel nama = new JLabel();
        nama.setText("Nama");
        nama.setBounds(50, 100, 100, 30); //x axis, y axis, width, height  
        j.add(nama); //adding button in JFrame 
        
        JLabel username = new JLabel();
        username.setText("Username");
        username.setBounds(50, 150, 100, 30); //x axis, y axis, width, height  
        j.add(username); //adding button in JFrame 
        
        JLabel password = new JLabel();
        password.setText("Password");
        password.setBounds(50, 200, 100, 30); //x axis, y axis, width, height  
        j.add(password); //adding button in JFrame 
        
        JLabel email = new JLabel();
        email.setText("Email");
        email.setBounds(50, 250, 100, 30); //x axis, y axis, width, height  
        j.add(email); //adding button in JFrame 
        
        JLabel noHp = new JLabel();
        noHp.setText("No HP");
        noHp.setBounds(50, 300, 100, 30); //x axis, y axis, width, height  
        j.add(noHp); //adding button in JFrame 
        
        JTextField namaTxt = new JTextField();
        namaTxt.setBounds(150, 100, 200, 30);//x axis, y axis, width, height  
        j.add(namaTxt);//adding button in JFrame  
        
        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(150, 150, 200, 30);//x axis, y axis, width, height  
        j.add(usernameTxt);//adding button in JFrame  
        
        JPasswordField passwordTxt = new JPasswordField();
        passwordTxt.setBounds(150, 200, 200, 30);//x axis, y axis, width, height  
        j.add(passwordTxt);//adding button in JFrame  
        
        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(150, 250, 200, 30);//x axis, y axis, width, height  
        j.add(emailTxt);//adding button in JFrame  
        
        JTextField noHpTxt = new JTextField();
        noHpTxt.setBounds(150, 300, 200, 30);//x axis, y axis, width, height  
        j.add(noHpTxt);//adding button in JFrame  
        
        JButton loginButton = new JButton();
        loginButton.setText("Register");
        loginButton.setBounds(150, 400, 100, 30);//x axis, y axis, width, height  
        j.add(loginButton);//adding button in JFrame  
        
        j.setSize(800, 800); //width and height  
        j.setLayout(null); //using no layout managers  
        j.setVisible(true); //making the frame visible  
    }
}
