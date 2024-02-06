package Ejercicios4;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int puntos = 0;

        System.out.println("¡Bienvenido al minicuestionario!");

        System.out.println("\nPregunta 1: ¿Cuál es la capital de Francia?");
        System.out.println("a) Madrid");
        System.out.println("b) París");
        System.out.println("c) Berlín");
        char respuesta1 = scanner.next().charAt(0);
        if (respuesta1 == 'b' || respuesta1 == 'B') {
            puntos++;
        }
        System.out.println("\nPregunta 2: ¿Cuál es el resultado de 5 + 7?");
        System.out.println("a) 10");
        System.out.println("b) 12");
        System.out.println("c) 15");
        char respuesta2 = scanner.next().charAt(0);
        if (respuesta2 == 'b' || respuesta2 == 'B') {
            puntos++;
        }

        System.out.println("\nPregunta 3: ¿Quién escribió 'Don Quijote de la Mancha'?");
        System.out.println("a) Miguel de Cervantes");
        System.out.println("b) Gabriel García Márquez");
        System.out.println("c) William Shakespeare");
        char respuesta3 = scanner.next().charAt(0);
        if (respuesta3 == 'a' || respuesta3 == 'A') {
            puntos++;
        }
        System.out.println("\n¡Cuestionario completado!");
        System.out.println("Tu calificación es: " + puntos + " puntos de 10.");

        scanner.close();
    }
}
