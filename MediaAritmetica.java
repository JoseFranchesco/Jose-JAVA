import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese tres numeros, separados por un espacio: ");
        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();
        double numero3 = scanner.nextDouble();

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("La media aritmética es: " + media);
        scanner.close();

    }
}