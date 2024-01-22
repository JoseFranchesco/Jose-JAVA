package Variables;

public class Variables {
    public static void main(String[] args) {
        // Variables
        /*
         * Nombre de las Variables, siempre empezar con una letra
         * la nomeclaturalowerCamelCase
         * volumen
         * volumenCilindrico
         * edadMinima / edadMin
         * edad_minima
         * Danny_22
         */
        /*
         * Tipo de dato
         * Entero(int y long)
         */
        // byte edad; //decla una variable de nombre edad y tipo de dato entero
        // edad = 20; //asignamos el valor de 20 a la variable edad
        
        double x, y;

        x = 7;
        y = 25.01;
        System.out.println(x);
        System.out.println(y);

        /*
         * Cadena de caracteres (string)
         */
        String miPalabra = "Cerveza";
        String miFrase = "¿Quien se tomo mi cerveza?";
        System.out.println("Una palabra que uso frecuentemente es: "+ miPalabra);
        System.out.println("Una frase que uso a veces es: "+ miFrase);

        // Vacio
        // String CadenaInicial = "";

        /*
         * Caracteres (char)
         */
        char letra1 = 'c';
        char letra2 = 'a';
        char letra3 = 's';
        char letra4 = 'a';
        System.out.println(letra1+letra2+letra3+letra4);

    }
}
