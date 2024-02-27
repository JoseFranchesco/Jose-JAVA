package Ejercicios6;

public class ejercicio8 {
    public static void main(String[] args) {
        System.out.print("\nBienvenid@ a la máquina tragaperras, si consigue 2 figuras iguales le devolveremos");
        System.out.println(" su dinero, si consigue las 3, habrá ganado el premio. ¡Buena suerte!.");
        System.out.println("-----------------------------------------------------------------------------");
            int figuras;
            int figura1 = 0;
            int figura2 = 0;
            int figura3 = 0;
        System.out.println();
            
            for (int i = 1; i <= 3; i++) {
              figuras = (int)(Math.random()*5+1);
              
              if (i == 1) {
                figura1 = figuras;
              } else if (i == 2) {
                figura2 = figuras;
              } else if (i == 3) {
                figura3 = figuras;
              }
              switch (figuras) {
                case 1:
                  System.out.print("Corazón ");
                  break;
                case 2:
                  System.out.print("Diamante ");
                  break;
                case 3:
                  System.out.print("Herradura ");
                  break;
                case 4:
                  System.out.print("Campana ");
                  break;
                case 5:
                  System.out.print("Limón ");
                  break;
                default:
                  System.out.print("Nada");
              }
            }
            System.out.println("\n---------------------------------------------------------------------------");

            if ((figura1 == figura2) && (figura2 == figura3)) {
              System.out.print("\n¡Enhorabuena, ha ganado el premio!, aquí tiene sus 10 monedas.");
            } else if ((figura1 == figura2) || (figura1 == figura3) || (figura2 == figura3)) {
              System.out.println("\n¡Uy!, ha estado a punto, aquí tiene su moneda de nuevo. En la siguiente tirada tendrá más suerte.");
            } else {
              System.out.print("\nVaya... ha perdido, no se desanime, a la siguiente tendrá más suerte...");
            }
    } 
}

