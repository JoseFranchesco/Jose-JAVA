package Ejercicios5;

import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero1, numero2;
        do {
            System.out.print("Introduce el primer número entero: ");
            while (!s.hasNextInt()) {
                System.out.println("¡Error! Debes introducir un número entero.");
                System.out.print("Introduce el primer número entero: ");
                s.next();
            }
            numero1 = s.nextInt();

            System.out.print("Introduce el segundo número entero (distinto al primero): ");
            while (!s.hasNextInt()) {
                System.out.println("¡Error! Debes introducir un número entero.");
                System.out.print("Introduce el segundo número entero (distinto al primero): ");
                s.next();
            }
            numero2 = s.nextInt();

            if (numero1 == numero2) {
                System.out.println("¡Error! Los números deben ser distintos.");
            }
        } while (numero1 == numero2);

        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);

        System.out.println("Números comprendidos entre " + menor + " y " + mayor + ", incrementados de 7 en 7:");
        for (int i = menor; i <= mayor; i += 7) {
            System.out.println(i);
        }
        s.close();
    }
}

