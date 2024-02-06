package Ejercicios4;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Programador junior");
        System.out.println("2 - Prog. senior");
        System.out.println("3 - Jefe de proyecto");
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        int cargo = scanner.nextInt();

        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        int diasViaje = scanner.nextInt();

        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        int estadoCivil = scanner.nextInt();

        double sueldoBase = calcularSueldoBase(cargo);

        double dietas = calcularDietas(diasViaje);

        double sueldoBruto = sueldoBase + dietas;

        double retencionIRPF = calcularRetencionIRPF(sueldoBruto, estadoCivil);
        double sueldoNeto = sueldoBruto - retencionIRPF;
        System.out.println("---------------------------------");
        System.out.println("| Sueldo base\t\t   " + formatearMoneda(sueldoBase));
        System.out.println("| Dietas (" + diasViaje + " viajes)\t\t   " + formatearMoneda(dietas));
        System.out.println("|--------------------------------|");
        System.out.println("| Sueldo bruto\t\t   " + formatearMoneda(sueldoBruto));
        System.out.println("| Retención IRPF (" + obtenerPorcentajeRetencion(estadoCivil) + "%)\t   " + formatearMoneda(retencionIRPF));
        System.out.println("|--------------------------------|");
        System.out.println("| Sueldo neto\t\t   " + formatearMoneda(sueldoNeto));
        System.out.println("----------------------------------");

        scanner.close();
    }
    public static double calcularSueldoBase(int cargo) {
        switch (cargo) {
            case 1: // Programador junior
                return 950.00;
            case 2: // Programador senior
                return 1200.00;
            case 3: // Jefe de proyecto
                return 1600.00;
            default:
                return 0.00;
        }
    }
    public static double calcularDietas(int diasViaje) {
        return diasViaje * 30.00;
    }
    public static double calcularRetencionIRPF(double sueldoBruto, int estadoCivil) {
        double porcentajeRetencion = obtenerPorcentajeRetencion(estadoCivil);
        return sueldoBruto * (porcentajeRetencion / 100.0);
    }
    public static double obtenerPorcentajeRetencion(int estadoCivil) {
        return (estadoCivil == 1) ? 25.0 : 20.0;
    }
    public static String formatearMoneda(double valor) {
        return String.format("%.2f", valor);
    }
}
