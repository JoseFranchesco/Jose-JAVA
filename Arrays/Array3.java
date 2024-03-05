package Arrays;

public class Array3 {
    public static void main(String[] args) {
        //Arreglo de notas
        double[] notas = new double[5];
        double suma = 0;
        System.out.println("Ingrese la nota de la 1era parcial");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota del estudiante n° "+(i+1)+": ");
            notas[i] = Double.parseDouble(System.console().readLine());
            suma = suma + notas[i];
        }
        System.out.println("El promedio del aula es: "+ suma / notas.length);

    }
}
