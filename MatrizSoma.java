package principal;

import java.util.Scanner;

public class MatrizSoma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Solicitar as dimensões da matriz
        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = sc.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = sc.nextInt();

        // Criar a matriz
        int[][] matriz = new int[linhas][colunas];

        // Preencher a matriz com valores fornecidos pelo usuário
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        // Calcular e exibir a soma dos elementos de cada linha
        System.out.println("\nSoma dos elementos de cada linha:");
        for (int i = 0; i < linhas; i++) {
            int somaLinha = 0;
            for (int j = 0; j < colunas; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.printf("Soma da linha %d: %d\n", i, somaLinha);
        }

        // Calcular e exibir a soma dos elementos de cada coluna
        System.out.println("\nSoma dos elementos de cada coluna:");
        for (int j = 0; j < colunas; j++) {
            int somaColuna = 0;
            for (int i = 0; i < linhas; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.printf("Soma da coluna %d: %d\n", j, somaColuna);
        }
		
		
		sc.close();
	}

}
