package principal;

import java.util.Scanner;

public class TabelaMatriz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int matriz [][] = { { 12, 88, 64 }, { 10, 19, 66 }, { 25, 17, 15 }, { 30, 25, 99 }, { 45, 55, 20 } };
		double maior;
		
		System.out.print("Escolha um número para ser o filtro: ");
		maior = sc.nextDouble();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j] > maior) {
					System.out.println("Número acima do valor informado: " + matriz[i][j]);
				}
			}
		}
		
		sc.close();
	}

}
