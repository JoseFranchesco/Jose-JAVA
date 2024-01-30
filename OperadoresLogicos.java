public class OperadoresLogicos {
    public static void main(String[] args) {
        /*Operadores logicos
         * 
         * && y (a<b) && (a>c)
         * || 0 (a<b)||(a>c)
         * ! NO !(a>b)
         */
        
         int numero = 99;
         if ((numero > 1) && (numero <100)){
         System.out.println("El numero ingresado esta entre el 1 al 100");
         }else{
            System.out.println("El numero no esta entre 1 y 100");
         }
    }
}
