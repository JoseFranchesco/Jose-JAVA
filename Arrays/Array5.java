package Arrays;

public class Array5 {
    public static void main(String[] args) {
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 10);
            System.out.println(numeros[i]);
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]+ " Par ");
            }else{
                System.out.println(numeros[i]+ " Impar ");
            }

        }
    }
}
