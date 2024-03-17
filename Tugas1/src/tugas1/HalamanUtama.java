/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

import BangunDatar.Persegi;
import BangunRuang.Balok;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class HalamanUtama extends JFrame implements ActionListener {
    JLabel judul = new JLabel();
    JLabel subjudul = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung Balok");
    JLabel labelPanjang = new JLabel("Panjang");
    JLabel labelLebar = new JLabel("Lebar");
    JLabel labelTinggi = new JLabel("Tinggi");
    JTextField inPanjang = new JTextField(40);
    JTextField inLebar = new JTextField(40);
    JTextField inTinggi = new JTextField(40);
    JButton hitung = new JButton("Hitung");
    JButton reset = new JButton("Reset");
    JLabel ketLuas = new JLabel("Luas Persegi");
    JLabel ketKeliling = new JLabel("Keliling Persegi");
    JLabel ketVolume = new JLabel("Volume Balok");
    JLabel luasPrm = new JLabel("Luas Permukaan Balok");
    JLabel hasilLuas = new JLabel("[Hasil berupa angka]");
    JLabel hasilKeliling = new JLabel("[Hasil berupa angka]");
    JLabel hasilVolume = new JLabel("[Hasil berupa angka]");
    JLabel hasilLuasPermukaan = new JLabel("[Hasil berupa angka]");
    JLabel hasil = new JLabel("Hasil");
   
    HalamanUtama(String namaPengguna, String jnsKelamin){
        String panggilan = (jnsKelamin == "L" ? "Mr. " : "Mrs. ");
        setVisible(true);
        setSize(580, 480);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLocationRelativeTo(null);
        setLayout(null);
        add(judul);
        judul.setText("Welcome, " + panggilan + namaPengguna );
        judul.setBounds(10, 10, 400, 40);
        judul.setFont(new Font("Arial", Font.BOLD, 22));
        
        add(subjudul);
        subjudul.setBounds(10, 40, 450, 40);
        subjudul.setFont(new Font("Arial", Font.PLAIN, 14));
        
        add(labelPanjang);
        labelPanjang.setBounds(10, 90, 100, 30);
        labelPanjang.setFont(new Font("Arial", Font.PLAIN, 14));
        
        add(inPanjang);
        inPanjang.setBounds(140, 95, 400, 25);
        
        add(labelLebar);
        labelLebar.setBounds(10, 130, 100, 30);
        labelLebar.setFont(new Font("Arial", Font.PLAIN, 14));
        
        add(inLebar);
        inLebar.setBounds(140, 135, 400, 25);
        
        add(labelTinggi);
        labelTinggi.setBounds(10, 170, 100, 30);
        labelTinggi.setFont(new Font("Arial", Font.PLAIN, 14));
        
        add(inTinggi);
        inTinggi.setBounds(140, 175, 400, 25);
        
        add(hitung);
        hitung.setBounds(10, 210, 540, 30);
        hitung.setFont(new Font("Arial", Font.BOLD, 14));
        hitung.setBackground(Color.white);
        hitung.addActionListener(this);
        
        add(reset);
        reset.setBounds(10, 250, 540, 30);
        reset.setFont(new Font("Arial", Font.BOLD, 14));
        reset.setBackground(Color.white);
        reset.addActionListener(this);
        
        add(hasil);
        hasil.setBounds(260, 290, 150, 30);
        hasil.setFont(new Font("Arial", Font.BOLD, 14));
        
        add(ketLuas);
        ketLuas.setBounds(10, 320, 100, 25);
        ketLuas.setFont(new Font("Arial", Font.PLAIN, 13));
        
        add(hasilLuas);
        hasilLuas.setBounds(250, 320, 250, 25);
        hasilLuas.setFont(new Font("Arial", Font.PLAIN, 13));
        
        add(ketKeliling);
        ketKeliling.setBounds(10, 345, 100, 25);
        ketKeliling.setFont(new Font("Arial", Font.PLAIN, 13));
        
        add(hasilKeliling);
        hasilKeliling.setBounds(250, 345, 250, 25);
        hasilKeliling.setFont(new Font("Arial", Font.PLAIN, 13));
        
        add(ketVolume);
        ketVolume.setBounds(10, 370, 100, 25);
        ketVolume.setFont(new Font("Arial", Font.PLAIN, 13));
        
        add(hasilVolume);
        hasilVolume.setBounds(250, 370, 250, 25);
        hasilVolume.setFont(new Font("Arial", Font.PLAIN, 13));
        
        add(luasPrm);
        luasPrm.setBounds(10, 395, 200, 25);
        luasPrm.setFont(new Font("Arial", Font.PLAIN, 13));
        
        add(hasilLuasPermukaan);
        hasilLuasPermukaan.setBounds(250, 395, 250, 25);
        hasilLuasPermukaan.setFont(new Font("Arial", Font.PLAIN, 13));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== hitung){
            try {
                //memastikan semua nilai telah di inputkan
                if(inPanjang.getText().isEmpty() || inLebar.getText().isEmpty() || inTinggi.getText().isEmpty()){
                   throw new Exception("Input Nilai !");
                }
                    //parsing nilai inputan
                    double panjang = Double.parseDouble(inPanjang.getText()); // konvert string ke double
                    double lebar = Double.parseDouble(inLebar.getText());
                    double tinggi = Double.parseDouble(inTinggi.getText());

                    Persegi hitungPersegi = new Persegi(panjang, lebar); //memanggil objek

                    //menghitung inputan dan mengubah angka ke string
                    String luasPersegi = String.valueOf(hitungPersegi.Luas());
                    String kelilingPersegi = String.valueOf(hitungPersegi.Keliling());
                    //menampilkan hasil untuk perhitungan persegi
                    hasilLuas.setText(luasPersegi);
                    hasilKeliling.setText(kelilingPersegi);

                    Balok hitungBalok = new Balok(panjang, lebar, tinggi);
                    
                    //menghitung inputan dan mengubah angka ke string
                    String luasPermukaanBalok = String.valueOf(hitungBalok.LuasPermukaan());
                    String volumeBalok = String.valueOf(hitungBalok.Volume());
                    
                    //menampilkan hasil untuk perhitungan Balok
                    hasilLuasPermukaan.setText(luasPermukaanBalok);
                    hasilVolume.setText(volumeBalok);
            } catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Inputan Bukan Angka !");
            }catch(Exception ex) {
                JOptionPane.showMessageDialog(this, "Input Nilai !");
            }

        }else if(e.getSource() == reset){
            inPanjang.setText("");
            inLebar.setText("");
            inTinggi.setText("");  
            
            hasilLuas.setText("[Hasil berupa angka]");
            hasilKeliling.setText("[Hasil berupa angka]");
            hasilLuasPermukaan.setText("[Hasil berupa angka]");
            hasilVolume.setText("[Hasil berupa angka]");
        }      
    }
}
