package EjerciciosArry;

public class ArrayBi06 {
    public static void main(String[] args) {
        /*
         * Realiza un programa que muestre en pantalla un array de 10 filas por
         * 10 columnas relleno con numeros aleatorios entre 200 y 300. A
         * continuacion el programa debe mostrar los numeros de la diagonal que va desde
         * la esquina superior izquierda a la esquina inferior derecha, asi
         * como el maximo, el minimo y la media de los numeros que hay en la
         * diagonal.
         */
        // 1. Declaramos nuestro array bidimencional
        int[][] matriz = new int[10][10];
        int[] diagonal = new int[10];
        // 2. rellenar con numeros aleatorios
        for (int filas = 0; filas < 10; filas++) {
            for (int columnas = 0; columnas < 10; columnas++) {
                matriz[filas][columnas] = (int) (Math.random() * 101) + 200;
                //Determinando los elemntos de la diagonal
                if (filas == columnas) {
                    diagonal[filas] = matriz[filas][columnas];
                }
                System.out.printf("%5d", matriz[filas][columnas]);
            }
            System.out.println();
        }
        int mayor = 200;
        int menor = 300;
        int suma = 0;
        System.out.println("Diagonal principal");
        for (int i = 0; i < diagonal.length; i++) {
            System.out.printf("%5d", diagonal[i]);
            if (diagonal[i] > mayor) {
                mayor = diagonal[i];
            }
            if (diagonal[i] < menor) {
                menor = diagonal[i];
            }
            suma = suma + diagonal[i];
        }
        System.out.println("\nMayor: "+mayor);
        System.out.println("Menor: "+menor);
        System.out.println("Promedio: "+((double)suma/10));

    }
}

