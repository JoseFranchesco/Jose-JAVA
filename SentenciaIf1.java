import java.util.Scanner;

public class SentenciaIf1 {
    public static void main(String[] args) {
        System.out.println("ingrese un numero entero: ");
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();

        if (numero > 0) {
            System.out.println("El numero "+numero+" es positivo.");
        }else{
            System.out.println("El numero "+numero+" es negativo.");
        }
        /*
         * OPERADORES DE COMPARACION
         * == igualdad a == b
         * != distinto a != b
         * < menor que a < b
         * > mayor que a > b
         * <= menor o igual que a <= b
         * >= mayor o igual que a >= b
         * 
         * programa que pida al usuario una nota, si esta nota es mayor que 10.5
         * mostrar un mensaje que ah aprobado y caso contrario indique que
         * desaprobo el curso.
         */
        System.out.print("Ingrese la nota: ");
        double nota = s.nextDouble();

        if (nota > 10.5) {
            System.out.println("¡Felicidades! Has aprobado el curso.");
        } else {
            System.out.println("Lo siento, has desaprobado el curso.");
        }

        s.close();
    }
}