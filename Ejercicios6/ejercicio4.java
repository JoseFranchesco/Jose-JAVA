package Ejercicios6;

import java.util.Random;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int numeroAleatorio = rand.nextInt(101);

        Scanner scanner = new Scanner(System.in);

        int intentos = 5;
        System.out.println("Adivina el número entre 0 y 100.");

        while (intentos > 0) {
            System.out.print("Introduce tu adivinanza: ");
            int intentoUsuario = scanner.nextInt();

            if (intentoUsuario == numeroAleatorio) {
                System.out.println("¡Felicidades! ¡Has adivinado el número!");
                break;
            } else {
                intentos--;
                System.out.println("Incorrecto. Te quedan " + intentos + " oportunidades.");

                if (intentoUsuario < numeroAleatorio) {
                    System.out.println("El número es mayor.");
                } else {
                    System.out.println("El número es menor.");
                }
            }
        }

        if (intentos == 0) {
            System.out.println("Agotaste tus oportunidades. El número correcto era: " + numeroAleatorio);
        }

        scanner.close();
    }
}

