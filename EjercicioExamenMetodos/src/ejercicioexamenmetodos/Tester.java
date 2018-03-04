/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexamenmetodos;

/**
 *
 * @author Álex
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] canastas = new int[30];
        canastas(canastas);
        imprimirArray(canastas);
    }

    public static void canastas(int[] canastas) {      
        for (int i = 0; i < canastas.length; i++) {
            canastas[i] = (int) (Math.random() * 100);
        }
    }
    public static void imprimirArray(int[] canastas){
        for (int i = 0; i < canastas.length; i++) {
            System.out.println("El dorsal nº"+(i+1)+" ha anotado "+canastas[i]+" puntos.");
        }
    }
}
