package JAVA;

public class ejercicio1 {
    public static void main(String[] args) {
        //Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no acertamos, 
        //se nos mostrará el mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”. 
        //Tendremos cuatro oportunidades para abrir la caja fuertes.
        int intentos = 4;
        int numeroIntroducido;
        boolean acertados=false;

        while((intentos>0) &&(!acertados)){
            System.out.println("introducir la clave");
            numeroIntroducido=Integer.parseInt(System.console().readLine());
            if (numeroIntroducido==1234) {
                System.out.println("has abierto la caja fuerte");
                acertados=true;
                // o tanmbien con break;
            } else {
                System.out.println("clave incorecta");
            }
            intentos--;
        }
    
    }
}