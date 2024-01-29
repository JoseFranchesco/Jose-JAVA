public class LecturaTeclado {
    public static void main(String[] args) {
        /*
         * Lectura de texto
         * System.console().readline().
         */
        String nombre;
        System.out.println("Por favor, dime como te llamas: ");
        nombre = System.console().readLine();
        System.out.println("Hola " + nombre +  ", Bienvenido!!!");
    }
}
