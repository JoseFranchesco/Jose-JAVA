package Ejercicios5;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        long numero = s.nextLong();

        long numeroAbsoluto = Math.abs(numero);

        int contadorDigitos = 0;

        while (numeroAbsoluto > 0) {
            numeroAbsoluto /= 10;
            contadorDigitos++;
        }

        System.out.println("El número introducido tiene " + contadorDigitos + " dígitos.");
        s.close();
    }
}
