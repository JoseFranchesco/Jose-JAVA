package Ejercicios03;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en megabytes: ");
        double megabytes = s.nextDouble();
        double kilobytes = megabytes * 1024;

        System.out.println(megabytes + " MB son " + kilobytes + " KB.");
        s.close();
    }
}
