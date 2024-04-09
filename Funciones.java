public class Funciones {
    public static void main(String[] args) {
        /*Funciones: una porcion de codigo que realiza una tarea especifica
         * 
         */
        System.out.println("ingrese un numero positivo: ");
        int n = Integer.parseInt(System.console().readLine());

        boolean esPrimo = true;
        for (int i = 2; i < n;i++){
            if ((n % i) ==0){
                esPrimo = false;
            }
        }
        
    }
}
