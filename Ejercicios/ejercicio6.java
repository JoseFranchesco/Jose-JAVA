package Ejercicios;

public class ejercicio6 {
    public static void main(String[] args) {
        int tamanoBase = 9;
    
        for (int i = 1; i <= tamanoBase; i += 2) {
            for (int j = 0; j < (tamanoBase - i) / 2; j++) {
                System.out.print(" ");}
    
            for (int k = 0; k < i; k++) {
        System.out.print("*");}
        System.out.println();
        }
    }
} 

