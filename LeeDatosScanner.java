import java.util.Scanner;

public class LeeDatosScanner {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre = s.nextLine();
        System.out.println("Hola "+ nombre);
        s.close();

    }
}
