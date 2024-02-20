package EXP1JoseFranchescoMarcasGallegos;


public class Problema1 {
    public static void main(String[] args) {
        final int TotalNumeros = 1000;
        final int Numerosengrupo = 20;

        for (int i = 1; i <= TotalNumeros; i++) {
            System.out.print(i + " ");
            if (i % Numerosengrupo == 0) {
                System.out.println();
            }   
        }
    }
}
