package Ejercicios6;

import java.util.Random;

public class ejercicio3 {
    public static void main(String[] args) {
        Random random = new Random();
    
    int maximo = 100;
    int minimo = 199;
    int suma = 0;
    int n;
        
    for (int i = 0; i < 50; i++) {
        n = random.nextInt(100) + 100;
        System.out.print(n + " ");
        suma += n;
          
        if (n < minimo) {
            minimo = n;
        }
          
        if (n > maximo) {
            maximo = n;
        }
    }
        
    System.out.println("\nMínimo: " + minimo + "\nMáximo: " + maximo + "\nMedia: " + suma / 50);
      
    }
}
