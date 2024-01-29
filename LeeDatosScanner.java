import java.util.Scanner;

public class LeeDatosScanner {
    public static void main(String[] args) {
        
        Scanner S = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre = S.nextLine();
        System.out.println("Hola "+ nombre);

    }
}
