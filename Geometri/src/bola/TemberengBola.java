/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bola;

import interfacePackage.Geometri;
import lingkaran.Lingkaran;

/**
 *
 * @author ASUS
 */
public class TemberengBola extends Lingkaran implements Geometri  {
    private final double tinggi;

    public TemberengBola(double tTembereng, double r) {
        super(r);
        this.tinggi = tTembereng;
    }
    
    @Override
    public double menghitungLuas(){
        return super.menghitungKeliling()*tinggi;
    }
    
    @Override
    public double menghitungVolume(){
        return (1/3)*super.phi*tinggi*tinggi*((3*super.r)-tinggi);
    }
    
}
