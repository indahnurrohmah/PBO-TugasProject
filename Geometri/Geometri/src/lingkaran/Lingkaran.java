/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran;

import interfaces.BangunDatar;

/**
 *
 * @author ASUS
 */
public class Lingkaran implements BangunDatar {
    public final double phi = 3.14, r;
    private double luas, keliling;
    
    public Lingkaran(double r) {
        this.r = r;
    }

    @Override
    public double menghitungLuas() {
        luas = phi*r*r;
        return luas;
    }

    @Override
    public double menghitungKeliling() {
        keliling = phi*2*r;
        return keliling;
    }

    /*dikomen dulu krn gk tau mau buat apa
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }*/

    public double getLuas() {
        return this.menghitungLuas();
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getKeliling() {
        return this.menghitungKeliling();
    }

    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }
    
}
