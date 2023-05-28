/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bola;

import lingkaran.Lingkaran;
import interfacePackage.Geometri;
/**
 *
 * @author ASUS
 */
public class JuringBola extends Lingkaran implements Geometri{
    private double rTembereng, tTembereng;

    public JuringBola(double rTembereng, double tTembereng, double r) {
        super(r);
        this.rTembereng = rTembereng;
        this.tTembereng = tTembereng;
    }
    
    @Override
    public double menghitungLuas(){
        return (super.menghitungKeliling()*tTembereng)+((super.menghitungKeliling()/2)*rTembereng);
    }
    
    @Override
    public double menghitungVolume(){
        return (2/3*super.menghitungLuas()*rTembereng);
    }
    
    
}
