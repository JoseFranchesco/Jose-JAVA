package EXP1JoseFranchescoMarcasGallegos;

import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //Sirve para crear nuevo Scanner
        System.out.println("Escriba diez numeros: ");
        //Los requerimos para un registro de informacion
        int positivos = 0; //Lo requerimos para el bucle for y se inicia en 0, representara los numeros positivos
        int negativos = 0; //Lo requerimos para el bucle for y se inicia en 0, representara los numeros negativos

        for (int i = 0; i < 10; i++){  //Esto genera un bucle con la condicion asignada
            System.out.println("numero "+(i+1)+": ");
            int numero = s.nextInt();

            if (numero > 0) {   //Verifica si el numero es posotivo
                positivos++; //La condicion sera psotivo
            } else if (numero < 0) { //Verifica si el numero es negativo
                negativos++; //La condicion sera negativo
            }
        }
        System.out.println("Resultados:"); //mostraran los valores en la pantalla
        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);

        s.close(); //Lo usamos para cerrar el scanner
    }
}
