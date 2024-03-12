public class ArrayBi01 {
    public static void main(String[] args) {
        int[][] n = new int[3][2]; // crear un array bidimensional de 3 filas y 2 columnas
        n[0][0] = 20;
        n[1][0] = 5;
        n[1][1] = 33;
        n[2][1] = 50;
        n[2][0] = 4;
        n[0][1] = 43;
        // n[2][2] = 20; no existe esa posicion
        int fila, columna;
        for (fila = 0; fila < 3; fila++) {
            System.out.print("Fila: " + fila);
            for (columna = 0; columna < 2; columna++) {
                System.out.printf("%10d ", n[fila][columna]);
            }
            System.out.println();
        }
    }
}
