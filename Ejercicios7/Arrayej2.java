package Ejercicios7;

public class Arrayej2 {
    public static void main(String[] args) {
    //EJERCICIO 1: Realiza un programa que rellene un array de 6 filas por 10 columnas
    //con numeros enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
    //continuacio, el programa deberá dar la posición tanto del maximo como del minimo.
        int[][] n = new int[6][10];
        int fila, columna;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int filaMaximo = 0, columnaMaximo = 0;
        int filaMinimo = 0, columnaMinimo = 0;

        for ( fila = 0; fila < 6; fila++) {
            for ( columna = 0; columna < 10; columna++) {
            n[fila][columna] = (int) (Math.random() * 1000);
            if (n[fila][columna] > maximo) {
                maximo = n[fila][columna];
                filaMaximo = fila;
                columnaMaximo = columna;
            }
            if (n[fila][columna] < minimo) {
                minimo = n[fila][columna];
                filaMinimo = fila;
                columnaMinimo = columna;
            }
            }
        }

            for (fila = 0; fila < 6; fila++) {
                for (columna = 0; columna < 10; columna++) {
                System.out.printf("%10d ", n[fila][columna]);
                 }
            System.out.println();
        }
        System.out.println("Posición máximo: Fila = "+ filaMaximo + ", Columna = " + columnaMaximo);
        System.out.println("Posición mínimo: Fila = "+ filaMinimo + ", Columna = " + columnaMinimo );
    }
}
