package Ejercicios03;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double numero1 = s.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double numero2 = s.nextDouble();

        double resultado = numero1 * numero2;

        System.out.println("La multiplicación es: " + resultado);
        s.close();
    }
}
