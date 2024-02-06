package Ejercicios4;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese tres números enteros
        System.out.print("Introduce el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int num2 = scanner.nextInt();

        System.out.print("Introduce el tercer número entero: ");
        int num3 = scanner.nextInt();

        // Llamar a la función para ordenar los números
        int[] numerosOrdenados = ordenarNumeros(num1, num2, num3);

        // Imprimir los números ordenados
        System.out.println("Números ordenados de menor a mayor: " +
                numerosOrdenados[0] + ", " +
                numerosOrdenados[1] + ", " +
                numerosOrdenados[2]);

        // Cerrar el scanner
        scanner.close();
    }

    // Función para ordenar tres números enteros
    public static int[] ordenarNumeros(int num1, int num2, int num3) {
        int[] numeros = {num1, num2, num3};

        // Utilizar el algoritmo de burbuja para ordenar los números
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Intercambiar los elementos si están en el orden incorrecto
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        return numeros;
    }
}
