package Ejercicios5;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numeroInicial = s.nextInt();

        System.out.println("Número | Cuadrado | Cubo");
        System.out.println("-------------------------");

        for (int i = 0; i < 5; i++) {
            int numeroActual = numeroInicial + i;
            int cuadrado = numeroActual * numeroActual;
            int cubo = numeroActual * numeroActual * numeroActual;

            System.out.printf("%6d | %8d | %4d%n", numeroActual, cuadrado, cubo);
        }
        s.close();
    }
}
