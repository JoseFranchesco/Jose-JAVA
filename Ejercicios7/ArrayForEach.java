package Ejercicios7;

public class ArrayForEach {
    public static void main(String[] args) {
        //Para errores con indecis usamos ForEach
        double[] notas = new double[4];

    System.out.println("Para calcular la nota media necesito saber \n la nota de cada examen");

    for (int i = 0; i < notas.length; i++) {
        System.out.println("Notan nº"+(i+1)+": ");
        notas[i] = Double.parseDouble(System.console().readLine());
    }

    double suma = 0;

    for (double n : notas) {
        System.out.println(n + " ");
        suma =  suma + n;
    }
    System.out.println("\n E1 Promedio es : "+suma/4);
    }
}
