package EXP1JoseFranchescoMarcasGallegos;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);//crearemos un nuevo scanner para que lea los datos

        System.out.print("Ingrese un numero Inicial: ");//ingresaremos un numero de inicio
        int inicio = s.nextInt();//lee el numero inicial dado
        System.out.print("Ingrese un numero Final: ");//ingresaremos un numero de fin
        int fin = s.nextInt();//lee el numero final dado

        if (fin <= inicio) { //Validaremos que el valor final sea mayor que el inicio
            System.out.println("Error: El valor de final debe ser mayor que el valor de inicio.");//Mostraremos un mensaje
            return; //En caso que no cumpla va devolver
        }
        System.out.print("Ingrese el tamaño del grupo: ");
        int tamanoGrupo = s.nextInt();//lee el tamaño del grupo dado

        for (int i = inicio; i <= fin; i++) { //creamos bucle con las condiciones
            System.out.print(i + " ");//i tiene valor 1 y lo sumaremos con un espacio para 

            if (i % tamanoGrupo == 0) { //verifica si i es divisible por el tamaño del grupo para que siga las condiciones
                System.out.print("¿Quieres continuar? (Sí/No): "); //Preguntaremos si se desea continuar
                String continuar = s.next().toLowerCase(); //se encarga de leer los carecteres y conivierte en minuscula
                if (!continuar.equals("si")) { //continuara mostrando dependiendo de la respuesta obtenida en el bucle for
                    break; //sirve para romper el bucle
                }
            }
        }
    }
}