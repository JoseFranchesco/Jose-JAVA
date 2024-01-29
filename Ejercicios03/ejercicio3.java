package Ejercicios03;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de pesetas a convertir: ");
        double pesetas = s.nextDouble();

        double tasaCambio = 0.00601012;
        double euros = pesetas * tasaCambio;

        System.out.println(pesetas + " pesetas son aproximadamente " + euros + " euros.");
        s.close();
    }
}
