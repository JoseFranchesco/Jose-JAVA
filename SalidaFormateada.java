public class SalidaFormateada {
    public static void main(String[] args) {
        System.out.printf("El número %d no tiene decimales.\n", 28);
        System.out.printf("El número %f sale con decimales.\n", 28.0);
        System.out.printf("El %.3f sale exactamente con 3 decimales.\n", 28.0);
    }
}
