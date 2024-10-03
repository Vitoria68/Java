package principal;

import java.util.Scanner;

public class MatrizPermutacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dimensao, i;
		boolean permutacao;
		int contagemUm = 0, contagemDois = 0;

		System.out.print("Digite a dimensão da matriz (n x n): ");
		dimensao = sc.nextInt();

		int matriz[][] = new int[dimensao][dimensao];

		System.out.println("Digite os elementos da matriz (0 ou 1):");
		for (i = 0; i < dimensao; i++) {
			for (int j = 0; j < dimensao; j++) {
				System.out.printf("Elemento [%d][%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nMatriz fornecida:");
		for (i = 0; i < dimensao; i++) {
			for (int j = 0; j < dimensao; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		// Verificar cada linha
		for (i = 0; i < dimensao; i++) {
			for (int j = 0; j < dimensao; j++) {
				if (matriz[i][j] == 1) {
					contagemUm++;
				} else if (matriz[i][j] != 0) {
					permutacao = false;// Se encontrar um número diferente de 0 ou 1
				}
			}
			if (contagemUm != 1) {
				permutacao = false; // Se a linha não contém exatamente um 1
			}

			// Verificar cada coluna
			for (int j = 0; j < dimensao; j++) {
				for (i = 0; i < dimensao; i++) {
					if (matriz[i][j] == 1) {
						contagemDois++;
					}
				}
				if (contagemDois != 1) {
					permutacao = false; // Se a coluna não contém exatamente um 1
				}
			}

			permutacao = true; // Se todas as verificações passaram
		}

		if (permutacao = true) {
			System.out.println("A matriz é uma matriz de permutação.");
		} else {
			System.out.println("A matriz não é uma matriz de permutação.");
		}

		sc.close();
	}
}
