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
public class Hilo extends Thread{

    public Hilo(String name) {
        super(name);
    }
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("iteracion " + i + " de "+ getName());
        }
        System.out.println("Termina el "+ getName());
    }
}
