/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import kerucut.Kerucut;
import kerucut.KerucutTerpancung;
import lingkaran.Lingkaran;
import tabung.Tabung;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        double r, tinggi, s;
    
        System.out.print("Input Jari-jari: ");
        r = input.nextDouble();  
        System.out.print("Input Tinggi: ");
        tinggi = input.nextDouble();
        System.out.print("Input Jari-jari atas: ");
        s= input.nextDouble();
        
        Lingkaran lingkaran = new Lingkaran(r);
        Tabung tabung = new Tabung(r, tinggi);
        Kerucut kerucut = new Kerucut(r, tinggi);
        KerucutTerpancung kerucutTerpancung = new KerucutTerpancung(tinggi, s, r);
        
        System.out.println("Luas Lingkaran = " + lingkaran.getLuas());
        System.out.println("Keliling Lingkaran = " + lingkaran.getKeliling());
        System.out.println("Luas Permukaan Tabung = " + tabung.getLuasPermukaan());
        System.out.println("Volume Tabung = " + tabung.getVolume());
        System.out.println("Luas Permukaan Kerucut = " + kerucut.getLuasPermukaan());
        System.out.println("Volume Kerucut = " + kerucut.getVolume());
        System.out.println("Luas Permukaan Kerucut Terpancung = " + kerucutTerpancung.getLuasPermukaan());
        System.out.println("Volume Kerucut Terpancung = " + kerucutTerpancung.getVolume());
    }
}
