package EXP1JoseFranchescoMarcasGallegos;

import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) { //iniciara la ejecucion del programa
        Scanner s = new Scanner(System.in); //crearemos un scanner para la entrada de datos
        System.out.print("Ingrese la altura que se usara para el objeto: ");
    
        double altura = s.nextDouble(); //almacenamos los datos en scanner usando la variable altura que nosotros proporcionaremos
        double gravedad = 9.81; //Establecemos el valor de la gravedad
        double tiempoDeCaida = Math.sqrt((2 * altura) / gravedad); //Usamos la formuola de tiempo de caida que es Tiempo de caida= raiz de 2 por la altura entre la gravedad

        System.out.println("El objeto tardara en caer: " + tiempoDeCaida + " segundos.");//texta para dar el resultado

    }
}
