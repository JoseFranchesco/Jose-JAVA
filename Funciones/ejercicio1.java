package Funciones;

public class ejercicio1 {
    public static boolean esCapicua(int numero) {
            return numero == voltea(numero);
        }
    
        public static boolean esPrimo(int numero) {
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }
    
        public static int siguientePrimo(int numero) {
            int siguiente = numero + 1;
            while (!esPrimo(siguiente)) {
                siguiente++;
            }
            return siguiente;
        }
    
        public static int potencia(int base, int exponente) {
            return (int) Math.pow(base, exponente);
        }
    
        public static int digitos(int numero) {
            return String.valueOf(numero).length();
        }
    
        public static int voltea(int numero) {
            int volteado = 0;
            while (numero > 0) {
                volteado = volteado * 10 + numero % 10;
                numero /= 10;
            }
            return volteado;
        }
    
        public static int digitoN(int numero, int posicion) {
            numero = voltea(numero);
            for (int i = 0; i < posicion; i++) {
                numero /= 10;
            }
            return numero % 10;
        }
    
        public static int posicionDeDigito(int numero, int digito) {
            numero = voltea(numero);
            int posicion = 0;
            while (numero > 0) {
                if (numero % 10 == digito) {
                    return posicion;
                }
                numero /= 10;
                posicion++;
            }
            return -1;
        }
    
        public static int quitaPorDetras(int numero, int n) {
            return numero / (int) Math.pow(10, n);
        }
    
        public static int quitaPorDelante(int numero, int n) {
            return voltea(quitaPorDetras(voltea(numero), n));
        }
    
        public static int pegaPorDetras(int numero, int digito) {
            return numero * 10 + digito;
        }
    
        public static int pegaPorDelante(int numero, int digito) {
            return voltea(pegaPorDetras(voltea(numero), digito));
        }
    
        public static int trozoDeNumero(int numero, int inicio, int fin) {
            return quitaPorDelante(quitaPorDetras(numero, digitos(numero) - fin - 1), inicio);
        }
    
        public static int juntaNumeros(int numero1, int numero2) {
            return Integer.parseInt(String.valueOf(numero1) + String.valueOf(numero2));
        }
    
        public static void main(String[] args) {
            int numero = 12321;
            System.out.println("¿Es capicua? " + esCapicua(numero));
            System.out.println("¿Es primo? " + esPrimo(numero));
            System.out.println("Siguiente primo: " + siguientePrimo(numero));
            System.out.println("Potencia: " + potencia(2, 3));
            System.out.println("Número de dígitos: " + digitos(numero));
            System.out.println("Volteado: " + voltea(numero));
            System.out.println("Dígito en posición 2: " + digitoN(numero, 2));
            System.out.println("Posición del dígito 3: " + posicionDeDigito(numero, 3));
            System.out.println("Quita por detrás: " + quitaPorDetras(numero, 2));
            System.out.println("Quita por delante: " + quitaPorDelante(numero, 2));
            System.out.println("Pega por detrás: " + pegaPorDetras(numero, 4));
            System.out.println("Pega por delante: " + pegaPorDelante(numero, 4));
            System.out.println("Trozo de número: " + trozoDeNumero(numero, 1, 3));
            System.out.println("Junta números: " + juntaNumeros(12, 345));
        
    }
    
}
