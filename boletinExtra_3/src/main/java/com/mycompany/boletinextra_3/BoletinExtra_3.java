
package com.mycompany.boletinextra_3;

import java.util.Scanner;

public class BoletinExtra_3 {

    public static void main(String[] args) {
        Scanner consola = new Scanner ( System.in );
        System.out.println("Introduce el valor de a");
        double a = consola.nextDouble();
        System.out.println("Introduce el valor de b");
        double b = consola.nextDouble();
        System.out.println("Introduce el valor de c");
        double c = consola.nextDouble();
        double z1 = Math.pow(b, 2) - (4 * a * c);
        double z2 = Math.pow(z1, 0.5);
        double y1 = ( - b + z2 ) / (2 * a);
        double y2 = ( - b - z2 ) / (2 * a);
        System.out.println("y1 = " + y1);
        System.out.println("y2 = " + y2);
    }
}
