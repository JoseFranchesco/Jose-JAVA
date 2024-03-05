package Ejercicios4;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Por favor, introduzca las tres notas:");
        double nota1 = pedirNota("Nota 1: ");
        double nota2 = pedirNota("Nota 2: ");
        double nota3 = pedirNota("Nota 3: ");

        double media = calcularMedia(nota1, nota2, nota3);

        System.out.println("La media de las tres notas es: " + media);

        String boletin = obtenerBoletin(media);
        System.out.println("Calificación del boletín: " + boletin);

        s.close();
    }

    public static double pedirNota(String mensaje) {
        Scanner s = new Scanner(System.in);

        System.out.print(mensaje);
        return s.nextDouble();
    }
    
    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }
    public static String obtenerBoletin(double media) {
        if (media >= 1 && media <= 10) {
            return "Insuficiente";
        } else if (media >= 11 && media <= 12) {
            return "Suficiente";
        } else if (media >= 13 && media <= 15) {
            return "Bien";
        } else if (media >= 16 && media <= 20) {
            return "Notable o Sobresaliente";
        } else {
            return "Nota fuera de rango";
        }
        
    }
}