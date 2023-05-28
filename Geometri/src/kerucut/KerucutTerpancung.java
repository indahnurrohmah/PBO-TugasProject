/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kerucut;

import interfacePackage.Geometri;
import lingkaran.Lingkaran;

/**
 *
 * @author ASUS
 */
public class KerucutTerpancung extends Lingkaran implements Geometri {
    public double tinggi, s;
    
    /*
    r = jari-jari bawah
    s = jari-jari atas
    tinggiKK = tinggi kerucut kecil
    tinggiKB = tinggi kerucut besar
    */

    public KerucutTerpancung(double tinggi, double s, double r) {
        super(r);
        this.tinggi = tinggi;
        this.s = s;
    }
    
    @Override
    public double menghitungVolume(){
        double tinggiKK = (tinggi*s)/(r-s);
        double tinggiKB = tinggi+tinggiKK;
        Kerucut kerucutBesar = new Kerucut(tinggiKB, r);
        Kerucut kerucutKecil = new Kerucut(tinggiKK, s);
        
        return kerucutBesar.menghitungVolume() - kerucutKecil.menghitungVolume();
    }

    @Override
    public double menghitungLuas() {
        double a = Math.pow(r-s, 2);
        double b = Math.pow(tinggi, 2);
        double garisPelukis = Math.sqrt(a+b);
        
        Lingkaran lingkaranAlas = new Lingkaran(r);
        Lingkaran lingkaranTutup = new Lingkaran(s);
        
        double luasSelimut = super.phi*garisPelukis*(r+s);
        
        return lingkaranAlas.menghitungLuas() + lingkaranTutup.menghitungLuas() + luasSelimut;
    }
    
    
}
