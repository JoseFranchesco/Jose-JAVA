package Ejercicios6;

import java.util.Random;

public class ejercicio7 {
    public static void main(String[] args) {
    Random random = new Random();
        int dado1, dado2;
        
        do {
            dado1 = random.nextInt(6) + 1;
            dado2 = random.nextInt(6) + 1;
          System.out.println(dado1 + " " + dado2);
        } while (dado1 != dado2);
      
    }
}
