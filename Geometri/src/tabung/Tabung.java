/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabung;

import interfacePackage.Geometri;
import lingkaran.Lingkaran;

/**
 *
 * @author ASUS
 */
public class Tabung extends Lingkaran implements Geometri{
    public double tinggi;
    
    public Tabung(double tinggi, double r) {
        super(r);
        this.tinggi = tinggi;
    }
    
    @Override
    public double menghitungLuas(){
        return 2*super.menghitungLuas() + super.menghitungKeliling()*tinggi;
    }
    
    @Override
    public double menghitungVolume(){
        return super.menghitungLuas()*tinggi;
    }
}
