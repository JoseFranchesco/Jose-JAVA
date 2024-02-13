package Ejercicios5;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int numero = s.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);

        s.close();
    }
}

