package EXP1JoseFranchescoMarcasGallegos;

import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese los numeros y 0 para terminar: ");
        //Declara las variables
        int introducciones = 0;
        int numeroactual = -1;
        int contadorSecuencia = 0;
        int maxContadorSecuencia = 0;
        int numeroMaxSecuencia = -1;
        while (true) { //inicia un bucle que se rompera con break
        int numero = s.nextInt();

        if (numero == 0) { //verifica si hay el numero 0
            break;
        }  introducciones++; //va a las variables por declarar
        if (numero == numeroactual) {
            
        } else {contadorSecuencia++;
            contadorSecuencia = 1; //una condicion para el ontador
            numeroactual = numero;
        }
        if (contadorSecuencia > maxContadorSecuencia) { //analiza las variables
            maxContadorSecuencia = contadorSecuencia;
            numeroMaxSecuencia = numeroactual;    
        }
        System.out.println("Número de introducciones efectuadas: " + introducciones); //verifiacamos si esta conforme
        if (maxContadorSecuencia > 1) {
            System.out.println("El número más repetido es el " + numeroMaxSecuencia + " y se ha escrito " + maxContadorSecuencia + " veces.");
        } else {
            System.out.println("No se han introducido secuencias repetidas.");
        }
        s.close();
         }
    }
}
