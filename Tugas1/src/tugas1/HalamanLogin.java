/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
/**
 *
 * @author ASUS
 */
public class HalamanLogin extends JFrame implements ActionListener{
    JLabel header = new JLabel("Selamat Datang!");
    JLabel subheader = new JLabel ("Silahkan Masuk Untuk Melanjutkan");
    JLabel usn = new JLabel ("Username");
    JLabel pass = new JLabel ("Password");
    JLabel gender = new JLabel ("Jenis Kelamin");
    JTextField username = new JTextField(40);
    JTextField password = new JTextField(40);
    JRadioButton laki = new JRadioButton("Laki-Laki");
    JRadioButton perempuan = new JRadioButton("Perempuan");
    JButton login = new JButton("Login");
    
    HalamanLogin(){
        setVisible(true);
        setSize(580, 480);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        setLocationRelativeTo(null);
        setLayout(null);
        add(header);
        header.setBounds(10, 10, 250, 40);
        header.setFont(new Font("Arial", Font.BOLD, 24));
        
        add(subheader);
        subheader.setBounds(10, 40, 250, 40);
        subheader.setFont(new Font("Arial", Font.PLAIN, 14));
        
        add(usn);
        usn.setBounds(10, 80, 250, 40);
        usn.setFont(new Font("Arial", Font.BOLD, 14));
        
        add(username);
        username.setBounds(10, 110, 540, 25);
        
        add(pass);
        pass.setBounds(10, 140, 250, 40);
        pass.setFont(new Font("Arial", Font.BOLD, 14));
        
        add(password);
        password.setBounds(10, 170, 540, 25);
        
        add(gender);
        gender.setBounds(10, 200, 250, 40);
        gender.setFont(new Font("Arial", Font.BOLD, 14));
        
        ButtonGroup jenisKelamin = new ButtonGroup();
        jenisKelamin.add(laki);
        jenisKelamin.add(perempuan);
        
            add(laki);
            laki.setBounds(10, 230, 100, 40);
            laki.setFont(new Font("Arial", Font.PLAIN, 14));

            add(perempuan);
            perempuan.setBounds(230, 230, 100, 40);
            perempuan.setFont(new Font("Arial", Font.PLAIN, 14));

        add(login);
        login.setBounds(10, 290, 540, 30);
        login.setFont(new Font("Arial", Font.BOLD, 14));
        login.setBackground(Color.white);
        login.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String namaPengguna = username.getText(); //mengambil inputan username
            String jnsKelamin = laki.isSelected() ? "L" : "P"; // operator ternari if else satu baris
            String sandi = password.getText(); //mengambil inputan username
                if(namaPengguna.isEmpty() && sandi.isEmpty()){
                    throw new Exception("Masukkan Username dan Password !");
                }else if(namaPengguna.isEmpty()){
                    throw new Exception ("Masukkan Username !");
                }else if(sandi.isEmpty()){
                    throw new Exception ("Masukkan Password !");
                }
            
            new HalamanUtama(namaPengguna, jnsKelamin); //memanggil halaman lain membawa info username yang diinputkan
                this.dispose();
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
}
    

