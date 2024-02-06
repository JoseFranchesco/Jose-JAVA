package Ejercicios4;

import java.util.Scanner;

public class ejercicios1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7: ");
        int numero = s.nextInt();

        String nombreDia = obtenerNombreDia(numero);

        System.out.println("El día correspondiente al número " + numero + " es: " + nombreDia);
        s.close();
    }
    public static String obtenerNombreDia(int numero) {
        String nombreDia;
        switch (numero) {
            case 1:
                nombreDia = "Domingo";
                break;
            case 2:
                nombreDia = "Lunes";
                break;
            case 3:
                nombreDia = "Martes";
                break;
            case 4:
                nombreDia = "Miércoles";
                break;
            case 5:
                nombreDia = "Jueves";
                break;
            case 6:
                nombreDia = "Viernes";
                break;
            case 7:
                nombreDia = "Sábado";
                break;
            default:
                nombreDia = "Número no válido, ingrese un número del 1 al 7.";
        }

        return nombreDia;
    }
}