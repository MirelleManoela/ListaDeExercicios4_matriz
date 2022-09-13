import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  // Questão 2 + melhorias solicitadas na questão 3


        int i;
        int j ;
        int tamanho1;
        int tamanho2 ;


        System.out.println("Escolha a largura da matriz: ");
        tamanho1 = sc.nextInt();
        System.out.println("Escolha o comprimento da matriz: ");
        tamanho2 = sc.nextInt();

        int[][] matri = new int[tamanho1][tamanho2];

        for (i = 0; i < tamanho1; i++) {
            for (j = 0; j <tamanho2; j++) {
                System.out.println("Escolha um numero da matriz  " + i + " na posição " + j);
                matri[i][j] = sc.nextInt();

            }
        }
        for (i = 0; i < tamanho1; i++) {
            for (j = 0; j < tamanho2; j++) {
                System.out.print(matri[i][j] + " ");
            }
            System.out.println();
        }
    }
}
