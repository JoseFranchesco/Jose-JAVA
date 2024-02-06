package Ejercicios4;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero: ");
        int numero = scanner.nextInt();

        boolean esPar = esNumeroPar(numero);
        boolean esDivisibleEntre5 = esNumeroDivisibleEntre5(numero);

        if (esPar && esDivisibleEntre5) {
            System.out.println("El número " + numero + " es par y divisible entre 5.");
        } else if (esPar) {
            System.out.println("El número " + numero + " es par, pero no es divisible entre 5.");
        } else if (esDivisibleEntre5) {
            System.out.println("El número " + numero + " no es par, pero es divisible entre 5.");
        } else {
            System.out.println("El número " + numero + " no es par ni divisible entre 5.");
        }

        scanner.close();
    }

    public static boolean esNumeroPar(int numero) {
        return numero % 2 == 0;
    }

    public static boolean esNumeroDivisibleEntre5(int numero) {
        return numero % 5 == 0;
    }
}
