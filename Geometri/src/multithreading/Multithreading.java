/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author ASUS
 */
public class Multithreading {
    public static void main(String[] args) {
        for (double i=14; i<=1014; i++) {
            GeometriThread geometri = new GeometriThread(i);
            Thread gThread = new Thread(geometri);
            gThread.start();
        }
    }
}
