package Funciones;

import java.util.Random;

public class ejercicio4 {

    public static int[] generaArrayInt(int tamaño, int minimo, int maximo) {
        int[] array = new int[tamaño];
        Random rand = new Random();
        for (int i = 0; i < tamaño; i++) {
            array[i] = rand.nextInt(maximo - minimo + 1) + minimo;
        }
        return array;
    }

    public static int minimoArrayInt(int[] array) {
        int minimo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }

    public static int maximoArrayInt(int[] array) {
        int maximo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }

    public static double mediaArrayInt(int[] array) {
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma / array.length;
    }

    public static boolean estaEnArrayInt(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public static int posicionEnArray(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return i;
            }
        }
        return -1;
    }

    public static int[] volteaArrayInt(int[] array) {
        int[] volteado = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            volteado[i] = array[array.length - 1 - i];
        }
        return volteado;
    }

    public static int[] rotaDerechaArrayInt(int[] array, int n) {
        int[] rotado = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            rotado[(i + n) % array.length] = array[i];
        }
        return rotado;
    }

    public static int[] rotaIzquierdaArrayInt(int[] array, int n) {
        return rotaDerechaArrayInt(array, array.length - n);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array original: " + java.util.Arrays.toString(array));
        System.out.println("Mínimo del array: " + minimoArrayInt(array));
        System.out.println("Máximo del array: " + maximoArrayInt(array));
        System.out.println("Media del array: " + mediaArrayInt(array));
        System.out.println("¿Está el número 3 en el array? " + estaEnArrayInt(array, 3));
        System.out.println("Posición del número 4 en el array: " + posicionEnArray(array, 4));
        System.out.println("Array volteado: " + java.util.Arrays.toString(volteaArrayInt(array)));
        System.out.println("Array rotado a la derecha 2 posiciones: " + java.util.Arrays.toString(rotaDerechaArrayInt(array, 2)));
        System.out.println("Array rotado a la izquierda 2 posiciones: " + java.util.Arrays.toString(rotaIzquierdaArrayInt(array, 2)));
    }
}

