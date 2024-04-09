package Funciones;

public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Números capicúa entre 1 y 99999:");
        for (int i = 1; i <= 99999; i++) {
            if (esCapicua(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static boolean esCapicua(int numero) {
        int original = numero;
        int volteado = 0;
            while (numero > 0) {
                volteado = volteado * 10 + numero % 10;
                numero /= 10;
        }
         return original == volteado;
    }
}
    