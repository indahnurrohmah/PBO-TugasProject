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
public class KerucutTerpancung extends Lingkaran implements BangunRuang {
    public double tinggi=24, s=7;
    private double luasPermukaan, volume;
    
    /*
    r = jari-jari bawah atau kerucut besar
    s = jari-jari atas atau kerucut kecil
    tinggiKK = tinggi kerucut kecil
    tinggiKB = tinggi kerucut besar
    */

    public KerucutTerpancung(double tinggi, double s, double r) {
        super(r);
        this.tinggi = tinggi;
        this.s = s;
    }
    
    public KerucutTerpancung(double r) {
        super(r);
    }

    @Override
    public double menghitungLuasPermukaan() {
        double tinggiKK = (tinggi*s)/(r-s);
        double tinggiKB = tinggi+tinggiKK;
        Kerucut kerucutBesar = new Kerucut(tinggiKB, r);
        Kerucut kerucutKecil = new Kerucut(tinggiKK, s);
        luasPermukaan = kerucutBesar.menghitungVolume() - kerucutKecil.menghitungVolume();
        return luasPermukaan;
    }

    @Override
    public double menghitungVolume() {
        double a = Math.pow(r-s, 2);
        double b = Math.pow(tinggi, 2);
        double garisPelukis = Math.sqrt(a+b);
        Lingkaran lingkaranAlas = new Lingkaran(r);
        Lingkaran lingkaranTutup = new Lingkaran(s);
        double luasSelimut = super.phi*garisPelukis*(r+s);
        volume = lingkaranAlas.menghitungLuas() + lingkaranTutup.menghitungLuas() + luasSelimut;
        return volume;
    }

    /*dikomen dulu krn gk tau mau buat apa
    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }
    */

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
