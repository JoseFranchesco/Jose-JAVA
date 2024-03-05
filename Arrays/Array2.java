package Arrays;

public class Array2 {
    public static void main(String[] args) {
        // Declaramos e indicamos los espacios que tendra
        // el arreglo
        int[] numeros = new int[15];
        // LLenamos el arreglo
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10);
        }
        // Mostramos los valores del arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
