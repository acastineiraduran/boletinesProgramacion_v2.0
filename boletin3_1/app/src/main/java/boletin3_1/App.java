/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package boletin3_1;

import java.util.Scanner;

public class App {
 

    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);
        System.out.println("Introducir precio tarifa");
        double tarifa = consola.nextDouble();
        System.out.println("Introducir precio pagado");
        double pagado = consola.nextDouble();
        int porcentaje = (int) (100.0 - (pagado * 100.0)/tarifa);
        System.out.println("El porcentaje descontado es del = " + porcentaje + "%");
        
    
        
    }
}
