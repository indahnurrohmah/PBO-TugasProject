/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import kerucut.Kerucut;
import kerucut.KerucutTerpancung;
import lingkaran.Lingkaran;
import tabung.Tabung;

/**
 *
 * @author ASUS
 */
public class GeometriThread implements Runnable {
    private double r;

    public GeometriThread(double r) {
        this.r = r;
    }
    
    @Override
    public void run() {
        Lingkaran lingkaran = new Lingkaran(r);
        Tabung tabung = new Tabung(r);
        Kerucut kerucut = new Kerucut(r);
        KerucutTerpancung kerucutTerpancung = new KerucutTerpancung(r);
            
        System.out.println("Luas Lingkaran untuk r = " + r + " : " + lingkaran.getLuas());
        System.out.println("Keliling Lingkaran untuk r = " + r + " : " + lingkaran.getKeliling());
        System.out.println("Luas Permukaan Tabung untuk r = " + r + " : " + tabung.getLuasPermukaan());
        System.out.println("Volume Tabung untuk r = " + r + " : " + tabung.getVolume());
        System.out.println("Luas Permukaan Kerucut untuk r = " + r + " : " + kerucut.getLuasPermukaan());
        System.out.println("Volume Kerucut untuk r = " + r + " : " + kerucut.getVolume());
        System.out.println("Luas Permukaan Kerucut Terpancung untuk r = " + r + " : " + kerucutTerpancung.getLuasPermukaan());
        System.out.println("Volume Kerucut Terpancung untuk r = " + r + " : " + kerucutTerpancung.getVolume());
    }
    
}
