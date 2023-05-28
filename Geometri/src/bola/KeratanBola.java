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
public class KeratanBola extends Lingkaran implements Geometri{
    private double rAtas, rBawah, tinggi;

    public KeratanBola(double rAtas, double rBawah, double tKeratan, double r) {
        super(r);
        this.rAtas = rAtas;
        this.rBawah = rBawah;
        this.tinggi = tKeratan;
    }
    
    @Override
    public double menghitungLuas(){
        return (super.menghitungKeliling()*tinggi);
    }
    
    @Override
    public double menghitungVolume(){
        return (1/2)*super.phi*rAtas*rAtas+(1/2)*rBawah*rBawah+(1/6)*tinggi*tinggi*tinggi;
    }
}
