package Ejercicios03;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        double tasaCambio = 5.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros que va convertir:");
        double euros = scanner.nextDouble();
        double soles = euros * tasaCambio;

        System.out.println(euros + " euros son: " + soles + " soles.");
        scanner.close();
    }
}
