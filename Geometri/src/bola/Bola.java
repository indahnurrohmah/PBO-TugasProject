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
public class Bola extends Lingkaran implements Geometri {

    public Bola(double r) {
        super(r);
    }
    
    @Override
    public double menghitungLuas(){
        return 4*super.menghitungLuas();
    }
    
    @Override
    public double menghitungVolume(){
        return 4/3*super.menghitungLuas()*r;
    }
    
}
