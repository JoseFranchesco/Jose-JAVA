package Ejercicios5;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numeroBase;
        do {
            System.out.print("Introduce un número entero positivo: ");
            while (!s.hasNextInt()) {
                System.out.println("¡Error! Debes introducir un número entero positivo.");
                System.out.print("Introduce un número entero positivo: ");
                s.next();
            }
            numeroBase = s.nextInt();

            if (numeroBase <= 0) {
                System.out.println("¡Error! Debes introducir un número entero positivo.");
            }
        } while (numeroBase <= 0);

        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += numeroBase + i;
        }

        System.out.println("La suma de los 100 números siguientes a " + numeroBase + " es: " + suma);

        s.close();
    }
}

