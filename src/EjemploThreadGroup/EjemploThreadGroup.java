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
public class EjemploThreadGroup {
    public static void main(String[] args) {
        ThreadGroup grupoHilos = new ThreadGroup("Mi grupo de hilos");
        Thread hilo1 = new GrupoHilos(grupoHilos,"Hilo 1");
        Thread hilo2 = new GrupoHilos(grupoHilos,"Hilo 2");
        Thread hilo3 = new GrupoHilos(grupoHilos,"Hilo 3");
        Thread hilo4 = new GrupoHilos(grupoHilos,"Hilo 4");
        Thread hilo5 = new GrupoHilos(grupoHilos,"Hilo 5");
        hilo4.setPriority(Thread.MAX_PRIORITY);
        grupoHilos.setMaxPriority(Thread.NORM_PRIORITY);
        System.out.println("Prioridad del grupo = "+grupoHilos.getMaxPriority());
        
        System.out.println("Prioridad Hilo1 = "+hilo1.getPriority());
        System.out.println("Prioridad Hilo2 = "+hilo2.getPriority());
        System.out.println("Prioridad Hilo3 = "+hilo3.getPriority());
        System.out.println("Prioridad Hilo4 = "+hilo4.getPriority());
        System.out.println("Prioridad Hilo5 = "+hilo5.getPriority());
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        
        listarHilos(grupoHilos);
    }   
    public static void listarHilos(ThreadGroup grupoActual){
        int numHilos;
        Thread[] listaDeHilos;
        
        numHilos = grupoActual.activeCount();
        listaDeHilos = new Thread[numHilos];
        grupoActual.enumerate(listaDeHilos);
        
        System.out.println("Numero de hilos activos es "+numHilos);
        for (int i = 0; i < numHilos; i++) {
            System.out.println("Hilo activo"+i+"="+listaDeHilos[i].getName());
        }
        
    }
}
