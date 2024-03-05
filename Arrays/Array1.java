package Arrays;

public class Array1 {
    public static void main(String[] args) {
        // Como definimos un array
        int[] arreglo;
        double[] notas;
        //int[] horasTrabajadas = new int[5];
        //espacios que va tener el arreglo
        arreglo = new int[4];
        notas = new double[5];
        // llenar esos espacios
        arreglo[0] = 12;
        arreglo[1] = 15;
        arreglo[2] = 17;
        arreglo[3] = 11;
        // Mostramos los valores que tiene el arreglo
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
        System.out.println(arreglo[3]);
        int suma = arreglo[0]+arreglo[1];
        System.out.println("Suma 1er con 2do: "+suma);
        
    }
}
