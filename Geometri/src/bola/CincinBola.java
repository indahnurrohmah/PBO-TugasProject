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
public class CincinBola extends Lingkaran implements Geometri{
    private double tCincin, taliBusur, rAtas, rBawah;

    public CincinBola(double tCincin, double taliBusur, double rAtas, double rBawah) {
        this.tCincin = tCincin;
        this.taliBusur = taliBusur;
        this.rAtas = rAtas;
        this.rBawah = rBawah;
    }
    
    @Override
    public double menghitungLuas(){
        return (super.menghitungKeliling()*tCincin)+(super.phi*taliBusur*(rAtas+rBawah));
    }
    
    @Override
    public double menghitungVolume(){
        return (1/6)*super.phi*tCincin*taliBusur*taliBusur;
    }
}
