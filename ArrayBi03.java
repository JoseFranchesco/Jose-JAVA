public class ArrayBi03 {
    public static void main(String[] args) {
        int[][] n = new int[3][2];
        int fila, columna;
        //Llenar el arreglo 3x2
        for ( fila = 0; fila < 3; fila++) {
            for ( columna = 0; columna < 2; columna++) {
                n[fila][columna] = (int) (Math.random() * 10);
            }
        }
        //MOstrar el arreglo
        for (fila = 0; fila < 3; fila++) {
            System.out.print("Fila: " + fila);
            for (columna = 0; columna < 2; columna++) {
                System.out.printf("%10d ", n[fila][columna]);
            }
            System.out.println();
        }
    }
}
