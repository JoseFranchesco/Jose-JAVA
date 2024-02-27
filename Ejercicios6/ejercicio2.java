package Ejercicios6;

import java.util.Random;

public class ejercicio2 {
    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = rand.nextInt(11);
            System.out.print(numeroAleatorio + " ");
        }

        System.out.println();
    }
}

