package Ejercicios03;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese la base del triángulo: ");
        double base = s.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = s.nextDouble();

        double area = 0.5 * base * altura;

        System.out.println("El área del triángulo es: " + area);
        s.close();
    }
}
