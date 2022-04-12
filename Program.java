import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de linhas: ");
        int m = sc.nextInt();
        System.out.print("Quantidade de colunas: ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        System.out.println();
        System.out.println("Preenchendo a matriz: ");
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.println("Posição " + i + "-" + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println();
        System.out.println("Selecione um número da matriz: ");
        int x = sc.nextInt();

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (matriz[i][j] == x){
                    System.out.println();
                    System.out.println("Posição " + i + "," + j + ":");
                    if (j > 0){
                        System.out.println("Esquerda: " + matriz[i][j-1]);
                    }
                    if (i > 0){
                        System.out.println("Cima: " + matriz[i-1][j]);
                    }
                    if (j < matriz.length-1){
                        System.out.println("Direita: " + matriz[i][j+1]);
                    }
                    if (i < matriz.length-1){
                        System.out.println("Baixo: " + matriz[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
