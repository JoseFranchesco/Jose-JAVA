import java.util.Arrays;

public class Array06 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 201); 
        }
        System.out.println("\n No ordenado: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+"\t");
        }
        System.out.println("\n Ordenado: ");
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+"\t");
        }
    }
}
