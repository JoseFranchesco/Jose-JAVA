package Ejercicios6;

import java.util.Random;

public class ejercicio5 {
    public static void main(String[] args) {
        Random rand = new Random();

        int n = 0;
        int cuentaNumeros = 0;
        
        while (n != 24) {
        n = rand.nextInt(26) * 2;
          System.out.print(n + " ");
          cuentaNumeros++;
        }
        System.out.println("\nSe han generado " + cuentaNumeros + " números.");
    }
}
