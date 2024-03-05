package Arrays;

public class Array6 {
    public static void main(String[] args) {
        /*
         * Escribe un programa que llene un array de 100 elementos con numeros enteros aleatorios entre 0 y 500
         * A continuacion el programa mostrara el array y preguntar al ususario si quiere el maximo o minimo, seguidamente
         * se volvera a mostrar el numero destacado entre dobles asteriscos
         * ejm
         * **1**
         * **480**
         */
        int[] numeros = new int[100];
        int maximo = 0;
        int minimo = 100;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 500);
            System.out.print(numeros[i]+" ");
        }
        System.out.print("¿Quiere el máximo o el mínimo? (max/min): ");
        for (int i = 0; i < 100; i++) {
            numeros[i] = (int)(Math.random() * 500);
            
            if (numeros[i] < minimo) {
              minimo = numeros[i];
            }
            
            if (numeros[i] > maximo)  {
              maximo = numeros[i];
            }
          }
          for (int elemento : numeros) {
            System.out.print(elemento + " ");
        }
            
    }
    
}
