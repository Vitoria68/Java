package principal;

import java.util.Scanner;

public class MatrizSimetrica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dimensao;

		System.out.print("Voce quer uma matriz quadrada de qual dimensao? ");
		dimensao = sc.nextInt();

		int matriz[][] = new int[dimensao][dimensao];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print("Qual o valor presente na linha " + i + " e na coluna " + j + "? ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j] == matriz[j][i]) {
					System.out.println("A matriz eh simetrica.");
				}
				else {
					System.out.println("A matriz eh assimetrica.");
				}
				break;
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
