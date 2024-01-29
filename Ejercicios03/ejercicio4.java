package Ejercicios03;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = s.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = s.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;

        double division = (numero2 != 0) ? numero1 / numero2 : 0;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        s.close();
    }
}
