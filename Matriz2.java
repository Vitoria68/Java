package principal;

import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int linha, coluna;
		
		System.out.println("Qual a dimensão da matriz de números inteiros que voce irá inserir (linha x coluna)?");
		linha = sc.nextInt();
		coluna = sc.nextInt();
		
		int matriz[][] = new int[linha][coluna];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("Qual o valor presente na linha " + i + " e na coluna " + j + "?");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		sc.close();
	}

}
