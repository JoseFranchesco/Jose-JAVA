package Ejercicios4;

import java.util.Scanner;

public class ejercicios4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese las tres notas
        System.out.println("Por favor, introduzca las tres notas:");
        double nota1 = pedirNota("Nota 1: ");
        double nota2 = pedirNota("Nota 2: ");
        double nota3 = pedirNota("Nota 3: ");

        // Calcular la media de las tres notas
        double media = calcularMedia(nota1, nota2, nota3);

        // Imprimir la media
        System.out.println("La media de las tres notas es: " + media);

        // Determinar la calificación del boletín
        String boletin = obtenerBoletin(media);

        // Imprimir la calificación del boletín
        System.out.println("Calificación del boletín: " + boletin);

        // Cerrar el scanner
        scanner.close();
    }

    // Función para solicitar una nota al usuario
    public static double pedirNota(String mensaje) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    // Función para calcular la media de tres notas
    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Función para obtener la calificación del boletín
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