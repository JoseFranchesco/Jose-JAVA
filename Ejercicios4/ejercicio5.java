package Ejercicios4;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca el día de nacimiento (1-31): ");
        int dia = scanner.nextInt();

        System.out.print("Ahora introduzca el mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();

        String horoscopo = obtenerHoroscopo(dia, mes);

        System.out.println("Tu horóscopo es: " + horoscopo);
        scanner.close();
    }
    public static String obtenerHoroscopo(int dia, int mes) {
        String signo = "";

        switch (mes) {
            case 1: // Enero
                signo = (dia >= 20) ? "Acuario" : "Capricornio";
                break;
            case 2: // Febrero
                signo = (dia >= 19) ? "Piscis" : "Acuario";
                break;
            case 3: // Marzo
                signo = (dia >= 21) ? "Aries" : "Piscis";
                break;
            case 4: // Abril
                signo = (dia >= 20) ? "Tauro" : "Aries";
                break;
            case 5: // Mayo
                signo = (dia >= 21) ? "Géminis" : "Tauro";
                break;
            case 6: // Junio
                signo = (dia >= 21) ? "Cáncer" : "Géminis";
                break;
            case 7: // Julio
                signo = (dia >= 23) ? "Leo" : "Cáncer";
                break;
            case 8: // Agosto
                signo = (dia >= 23) ? "Virgo" : "Leo";
                break;
            case 9: // Septiembre
                signo = (dia >= 23) ? "Libra" : "Virgo";
                break;
            case 10: // Octubre
                signo = (dia >= 23) ? "Escorpio" : "Libra";
                break;
            case 11: // Noviembre
                signo = (dia >= 22) ? "Sagitario" : "Escorpio";
                break;
            case 12: // Diciembre
                signo = (dia >= 22) ? "Capricornio" : "Sagitario";
                break;
            default:
                signo = "Mes no válido";
        }

        return signo;
    }
}
