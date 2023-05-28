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
public class Kerucut extends Lingkaran implements Geometri{
    public double tinggi;
    
    public Kerucut(double tinggi, double r){
        super(r);
        this.tinggi = tinggi;
    }
    
    @Override
    public double menghitungLuas(){
        double a = Math.pow(r, 2);
        double b = Math.pow(tinggi, 2);
        double garisPelukis = Math.sqrt(a+b);
                
        return (garisPelukis*super.phi*r) + super.menghitungLuas();
    }
    
    @Override
    public double menghitungVolume(){
        return super.menghitungLuas()*tinggi/3;
    }
}
