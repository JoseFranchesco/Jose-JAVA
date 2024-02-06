package Ejercicios4;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        int horasTrabajadas = s.nextInt();

        double salario = calcularSalario(horasTrabajadas);

        System.out.println("El sueldo semanal que le corresponde es de " + salario + " soles");
        s.close();
    }
    public static double calcularSalario(int horasTrabajadas) {
        int horasOrdinarias = Math.min(horasTrabajadas, 40);
        int horasExtras = Math.max(horasTrabajadas - 40, 0);

        double salarioOrdinario = horasOrdinarias * 12;
        double salarioExtras = horasExtras * 16;

        double salarioTotal = salarioOrdinario + salarioExtras;
        return salarioTotal;
    }
}
