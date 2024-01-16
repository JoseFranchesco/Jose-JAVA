package Ejercicios;

public class ejercicio03 {
    public static void main(String[] args) {
        String[] palabrasIngles = {"computer", "student", "cat", "table", "book", "house", "car", "music", "friend", "sun"};
        String[] traduccionesEspanol = {"ordenador", "alumno/a", "gato", "mesa", "libro", "casa", "coche", "música", "amigo/a", "sol"};

        // Mostrar las palabras y sus traducciones en una tabla
        System.out.println("Palabra\t\tTraducción");
        System.out.println("---------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-15s\t%-15s%n", palabrasIngles[i], traduccionesEspanol[i]);
        }
    }
}

