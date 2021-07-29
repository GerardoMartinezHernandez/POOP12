/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop12;

/**
 *
 * @author gerar
 */
public class POOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("########Thread##############");
        Hilo hilo1 = new Hilo("Primer hilo");
        hilo1.start();
        
        new Hilo("Segundo Hilo").start();
        
        System.out.println("########Runnable##############");
        new Thread(new HiloR()," HiloR 1").start();
        new Thread(new HiloR()," HiloR 2").start();
        System.out.println("Termina el Hilo principal");
    }
    
}
