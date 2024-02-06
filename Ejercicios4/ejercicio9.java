package Ejercicios4;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la base imponible: ");
        double baseImponible = scanner.nextDouble();

        System.out.print("Introduzca el tipo de IMPUESTO (general, reducido o superreducido): ");
        String tipoImpuesto = scanner.next().toLowerCase();

        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigoPromocional = scanner.next().toLowerCase();

        double impuesto = calcularImpuesto(baseImponible, tipoImpuesto);
        double descuento = calcularDescuento(baseImponible, codigoPromocional);
        double precioFinal = baseImponible + impuesto - descuento;

        System.out.println("\nBase imponible\t\t" + formatearMoneda(baseImponible));
        System.out.println("IMPUESTO (" + obtenerPorcentajeImpuesto(tipoImpuesto) + "%)\t\t" + formatearMoneda(impuesto));
        System.out.println("Precio con IMPUESTO\t" + formatearMoneda(baseImponible + impuesto));
        System.out.println("Cód. promo. (" + obtenerNombreCodigoPromocional(codigoPromocional) + "): \t-" + formatearMoneda(descuento));
        System.out.println("TOTAL\t\t\t" + formatearMoneda(precioFinal));

        scanner.close();
    }

    public static double calcularImpuesto(double baseImponible, String tipoImpuesto) {
        switch (tipoImpuesto) {
            case "general":
                return baseImponible * 0.21;
            case "reducido":
                return baseImponible * 0.10;
            case "superreducido":
                return baseImponible * 0.04;
            default:
                return 0.0;
        }
    }

    public static double calcularDescuento(double baseImponible, String codigoPromocional) {
        switch (codigoPromocional) {
            case "nopro":
                return 0.0;
            case "mitad":
                return baseImponible / 2.0;
            case "meno5":
                return 5.0;
            case "5porc":
                return baseImponible * 0.05;
            default:
                return 0.0;
        }
    }

    public static int obtenerPorcentajeImpuesto(String tipoImpuesto) {
        switch (tipoImpuesto) {
            case "general":
                return 21;
            case "reducido":
                return 10;
            case "superreducido":
                return 4;
            default:
                return 0;
        }
    }

    public static String obtenerNombreCodigoPromocional(String codigoPromocional) {
        switch (codigoPromocional) {
            case "nopro":
                return "nopro";
            case "mitad":
                return "mitad";
            case "meno5":
                return "meno5";
            case "5porc":
                return "5porc";
            default:
                return "";
        }
    }

    public static String formatearMoneda(double valor) {
        return String.format("%.2f", valor);
    }
}
