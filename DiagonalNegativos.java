package principal;

import java.util.Scanner;

public class DiagonalNegativos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int N, cont;
		
		System.out.println("Qual a ordem da matriz?");
		N = teclado.nextInt();
		
		int [][] mat = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				 System.out.println("Elemento[" + i + " , " + j + "]: ");
				 mat[i][j] = teclado.nextInt();
			}			
		}
		
		System.out.println("Diagonal principal: ");
		for (int i = 0; i < N; i++) {		
				 System.out.println(mat[i][i] + " ");
			}
			System.out.println();
		 
		cont = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				 if (mat[i][j] < 0) {
					 cont++;
				 }
			}			
		}
		
		System.out.println("Quantidade de negativos = " + cont);
		
		teclado.close();
	}

}
