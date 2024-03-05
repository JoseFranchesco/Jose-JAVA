package Arrays;


public class Array4 {
    public static void main(String[] args) {
        /*vamos a crear un programa que genere 100 numeros aleatorios de 1 al 20, 
        los mostrados en pantalla separadis por espacios, el progreso pedira que ingrese
        dos valores por teclado y a continuacion el programa cambiara el primero por el segundo.
        */
        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 21);
            System.out.print(numeros[i]+" - ");
        }

        System.out.print("\nIngrese un numero de los que se han mostrado: ");
        int valor1 = Integer.parseInt(System.console().readLine());
        System.out.print("Ingrese un Valor para reemplazarlo: ");
        int valor2 = Integer.parseInt(System.console().readLine());

        String verde = "\033[32m";
        String blanco = "\033[37m";

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor1) {
            numeros[i] = valor2;
            System.out.print(verde + numeros[i]+" - ");   
            }
            else{
                System.out.print(blanco + numeros[i]+" - ");
            }
        }
        //Realice un programa que genere 8 numeros aleatorios y que luego muestre esos numeros junto.
        //A la palabra par o impar segun corresponda.
        int[] numeros2 = new int[8];

        for (int i = 0; i < numeros2.length; i++) {
            numeros[i] = (int)(Math.random() * 8);
            System.out.print(numeros[i]+" - ");


        }
    }
}
