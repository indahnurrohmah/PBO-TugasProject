/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran;

import interfacePackage.Geometri;

/**
 *
 * @author ASUS
 */
public class Lingkaran implements Geometri {
    public final double phi = 3.14;
    public double r=7, luas, keliling;

    public Lingkaran(){
    }

    public Lingkaran(double r) {
        this.r = r;
    }
    
    @Override
    public double menghitungLuas(){
        luas = phi*r*r;
        return luas;
    }
    
    @Override
    public double menghitungKeliling(){
        keliling = phi*2*r;
        return keliling;
    }
    
    @Override
    public double menghitungVolume(){
        return 0;
    }
}
