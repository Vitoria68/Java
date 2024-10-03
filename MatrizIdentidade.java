package principal;

import java.util.Scanner;

public class MatrizIdentidade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o tamanho da matriz (n x n): ");
		int n = sc.nextInt();

		int[][] matriz = new int[n][n];

		System.out.println("Digite os elementos da matriz:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				matriz[i][j] = sc.nextInt();
			}
		}

		boolean identidade = true;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i == j) {
					if (matriz[i][j] != 1) {

						i = matriz.length;
						j = matriz.length;
						identidade = false;

					}

				}
			}
		}

		if (identidade) {
			System.out.println("é uma matriz identidade");

		} else {
			System.out.println("Não é uma matriz identidade");
		}
		sc.close();
	}
}
