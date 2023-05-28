/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabung;

import interfaces.BangunRuang;
import lingkaran.Lingkaran;

/**
 *
 * @author ASUS
 */
public class Tabung extends Lingkaran implements BangunRuang {
    public double tinggi=24;
    private double luasPermukaan, volume;
    
    public Tabung(double tinggi, double r) {
        super(r);
        this.tinggi = tinggi;
    }
    
    public Tabung(double r) {
        super(r);
    }

    @Override
    public double menghitungLuasPermukaan() {
        luasPermukaan = 2*super.menghitungLuas() + super.menghitungKeliling()*tinggi;
        return luasPermukaan;
    }

    @Override
    public double menghitungVolume() {
        volume = super.menghitungLuas()*tinggi;
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
