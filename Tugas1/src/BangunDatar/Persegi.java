/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author ASUS
 */
public class Persegi implements OperasiPersegi {
    private double panjang, lebar;
    public Persegi(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public double Luas() {
        return panjang*lebar;
    }

    @Override
    public double Keliling() {
        return 2*(panjang+lebar);
    }
    
}
