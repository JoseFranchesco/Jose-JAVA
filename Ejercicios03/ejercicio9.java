package Ejercicios03;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    
        System.out.print("Introduce la nota del primer examen: ");
        double notaPrimerExamen = s.nextDouble();
    
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        double mediaDeseada = s.nextDouble();
    
        double porcentajeNotaPrimerExamen = 0.4;
        double porcentajeNotaSegundoExamen = 0.6;
    
        double notaRestante = mediaDeseada * porcentajeNotaSegundoExamen - (notaPrimerExamen * porcentajeNotaPrimerExamen);
    
        if (notaRestante <= 0) {
            System.out.println("Ya has alcanzado o superado la media deseada.");
        } else {
            double notaSegundoExamen = notaRestante / porcentajeNotaSegundoExamen;
    
            System.out.println("Para tener un " + mediaDeseada + " en el trimestre necesitas sacar un " + notaSegundoExamen + " en el segundo examen.");
            }
            s.close();
    }
}