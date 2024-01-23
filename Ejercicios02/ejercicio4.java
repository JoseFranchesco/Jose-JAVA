package Ejercicios02;

public class ejercicio4 {
    public static void main(String[] args) {
        double cantidadEnSoles = 150.0;
        double factorConversion = 0.22;
        double cantidadEnEuros = cantidadEnSoles * factorConversion;
    
        System.out.println("Cantidad en soles: " + cantidadEnSoles);
        System.out.println("Factor de conversión: " + factorConversion);
        System.out.println("Cantidad equivalente en euros: " + cantidadEnEuros);
    }
}
