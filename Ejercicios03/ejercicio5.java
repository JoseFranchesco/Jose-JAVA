package Ejercicios03;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese la base del rectángulo: ");
        double base = s.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = s.nextDouble();

        double area = base * altura;

        System.out.println("El área del rectángulo es: " + area);
        s.close();
    }
}
