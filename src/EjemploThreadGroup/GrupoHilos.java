/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploThreadGroup;

/**
 *
 * @author gerar
 */
public class GrupoHilos extends Thread{

    public GrupoHilos(ThreadGroup group, String name) {
        super(group, name);
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+" cuenta "+i);
        }
    }
    
        
        
}
    
