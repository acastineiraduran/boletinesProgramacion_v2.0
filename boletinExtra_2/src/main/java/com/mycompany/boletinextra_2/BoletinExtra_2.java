

package com.mycompany.boletinextra_2;

import java.util.Scanner;

public class BoletinExtra_2 {

    public static void main(String[] args) {
        Scanner consola = new Scanner ( System.in );
        System.out.println("Introduce el valor de a");
        double a = consola.nextDouble();
        System.out.println("Introduce el valor de b");
        double b = consola.nextDouble();
        System.out.println("Introduce el valor de c");
        double c = consola.nextDouble();
        System.out.println("Introduce el valor de x");
        double x = consola.nextDouble();
        //operacion
        double y = a * (Math.pow(x, 2)) + b * x + c;
        System.out.println("y = " + y);
        
            
    }
}
