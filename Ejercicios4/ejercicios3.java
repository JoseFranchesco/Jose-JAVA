package Ejercicios4;

import java.util.Scanner;

public class ejercicios3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Por favor, introduzca el valor de a: ");
        double a = s.nextDouble();

        System.out.print("Ahora introduzca el valor de b: ");
        double b = s.nextDouble();
        double solucion = resolverEcuacion(a, b);

        if (Double.isNaN(solucion)) {
            System.out.println("Esa ecuación no tiene solución real.");
        } else {
            System.out.println("x = " + solucion);
        }
        s.close();
    }
    public static double resolverEcuacion(double a, double b) {
        if (a == 0) {
            return Double.NaN;
        } else {
            double x = -b / a;
            return x;
        }
    }
}
