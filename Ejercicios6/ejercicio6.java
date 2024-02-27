package Ejercicios6;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ejercicio6 {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        int linea = 0;
        
        System.out.print("\033[32m");
        
        for(int i = 0; i < 8000; i++) {
            System.out.print((char)(rand.nextInt(95) + 32));
          
          if (linea++ == 60) {
            linea = 0;
            try {
        TimeUnit.MILLISECONDS.sleep(50);//pausa la ejecucion
        } catch (InterruptedException e) {
         e.printStackTrace();
        }
            System.out.println();
          }
        }
    }
}
