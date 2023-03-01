package PertemuanKe2;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class TugasRumah {
    public static void main(String[] args) {
        JFrame j=new JFrame("Tugas Pertemuan Ke-2"); //creating instance of JFrame  
        
        JLabel judul = new JLabel();
        judul.setText("Form Biodata");
        judul.setBounds(350, 1, 500, 100); //x axis, y axis, width, height  
        j.add(judul); //adding button in JFrame 
        
        JLabel nama = new JLabel();
        nama.setText("Nama");
        nama.setBounds(50, 80, 100, 30); //x axis, y axis, width, height  
        j.add(nama); //adding button in JFrame 
        
        JTextField namaTxt = new JTextField();
        namaTxt.setBounds(150, 80, 200, 30);//x axis, y axis, width, height  
        j.add(namaTxt);//adding button in JFrame 
        
        JLabel jekel = new JLabel();
        jekel.setText("Jenis Kelamin");
        jekel.setBounds(50, 130, 100, 30); //x axis, y axis, width, height  
        j.add(jekel); //adding button in JFrame 
        
        JRadioButton r1=new JRadioButton("Laki-Laki");    
        JRadioButton r2=new JRadioButton("Perempuan");    
        r1.setBounds(150, 130, 100, 30);    
        r2.setBounds(150, 155, 100, 30);    
        ButtonGroup bg=new ButtonGroup();    
        bg.add(r1);bg.add(r2);    
        j.add(r1);j.add(r2);   
        
        JLabel agama = new JLabel();
        agama.setText("Agama");
        agama.setBounds(50, 190, 100, 30); //x axis, y axis, width, height  
        j.add(agama); //adding button in JFrame 
        
        String Agama[]={"Islam","Kristen","Hindu","Budha","Konghucu"};        
        JComboBox cb=new JComboBox(Agama);    
        cb.setBounds(150, 200, 90, 20);    
        j.add(cb);        
        j.setLayout(null);    
        j.setSize(400,500);    
        j.setVisible(true);       
        
        JLabel hobi = new JLabel();
        hobi.setText("Hobi");
        hobi.setBounds(50, 240, 100, 30); //x axis, y axis, width, height  
        j.add(hobi); //adding button in JFrame
        
        String Hobi[]={"Menulis","Membaca","Menonton","Travelling","Kulinner"};        
        JComboBox co=new JComboBox(Hobi);    
        co.setBounds(150, 245, 90, 20);    
        j.add(co);        
        j.setLayout(null);    
        j.setSize(400,500);    
        j.setVisible(true); 
        
        JLabel email = new JLabel();
        email.setText("Email");
        email.setBounds(50, 290, 100, 30); //x axis, y axis, width, height  
        j.add(email); //adding button in JFrame
        
        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(150, 290, 200, 30);//x axis, y axis, width, height  
        j.add(emailTxt);//adding button in JFrame 
        
        JLabel noHp = new JLabel();
        noHp.setText("Alamat");
        noHp.setBounds(50, 340, 100, 30); //x axis, y axis, width, height  
        j.add(noHp); //adding button in JFrame
        
        JTextArea area=new JTextArea("");  
        area.setBounds(150, 345, 400, 150);  
        j.add(area);  
        j.setSize(300,300);  
        j.setLayout(null);  
        j.setVisible(true);  
        
        JButton loginButton = new JButton();
        loginButton.setText("Submit");
        loginButton.setBounds(450, 525, 100, 30);//x axis, y axis, width, height  
        j.add(loginButton);//adding button in JFrame
        
        j.setSize(800, 800); //width and height  
        j.setLayout(null); //using no layout managers  
        j.setVisible(true); //making the frame visible  
    }
}

