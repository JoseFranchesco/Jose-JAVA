package Ejercicios6;

import java.util.Random;

public class BarajaFrancesa {
    public static void main(String[] args) {
        Random random = new Random();
    
        String palo = "";
        String carta = "";
        
        int numeroPalo = random.nextInt(4) + 1;
        
        switch(numeroPalo) {
          case 1:
            palo = "picas";
            break;
          case 2:
            palo = "corazones";
            break;
          case 3:
            palo = "diamantes";
            break;
          case 4:
            palo = "tréboles";
          default:
        }
    
        int numeroCarta = random.nextInt(13) + 1;
        
        switch(numeroCarta) {
          case 1:
            carta = "As";
            break;
          case 11:
            carta = "J";
            break;
          case 12:
            carta = "Q";
            break;
          case 13:
            carta = "K";
            break;
          default:
            carta = String.valueOf(numeroCarta);
        }
        
        System.out.println(carta + " de " + palo);
      
    }
}
