/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kerucut;

import interfaces.BangunRuang;
import lingkaran.Lingkaran;

/**
 *
 * @author ASUS
 */
public class Kerucut extends Lingkaran implements BangunRuang {
    public double tinggi;
    private double luasPermukaan, volume;
    
    public Kerucut(double tinggi, double r) {
        super(r);
        this.tinggi = tinggi;
    }
    
    @Override
    public double menghitungLuasPermukaan() {
        double a = Math.pow(r, 2);
        double b = Math.pow(tinggi, 2);
        double garisPelukis = Math.sqrt(a+b);
        luasPermukaan = (garisPelukis*super.phi*r) + super.menghitungLuas();
        return luasPermukaan;
    }

    @Override
    public double menghitungVolume() {
        volume = super.menghitungLuas()*tinggi/3;
        return volume;
    }

    /*dikomen dulu krn gk tau mau buat apa
    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }*/

    public double getLuasPermukaan() {
        return this.menghitungLuasPermukaan();
    }

    public void setLuasPermukaan(double luasPermukaan) {
        this.luasPermukaan = luasPermukaan;
    }

    public double getVolume() {
        return this.menghitungVolume();
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    
}
