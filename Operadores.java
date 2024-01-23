public class Operadores {
    public static void main(String[] args) {
        /*Operadores aritmeicos
         * + Suma
         * - Resta
         * * multiplicacion
         * / division
         * % resto(modulo)
         * ++ incremento
         * -- decremento
         */

        int x = 100;

        System.out.println(x+" - "+(x+5)+" - "+(x-5));
        System.out.println((x*5)+" - "+(x/5)+" - "+(x%5));

        int nota1 = 12;
        int nota2 = 14;
        int nota3 = 9;
        double promedio;
        promedio = ((double)nota1+(double)nota2+(double)nota3)/3;
        System.out.println(promedio);


    }
}
