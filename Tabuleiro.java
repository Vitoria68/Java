package principal;

import java.util.Scanner;

public class Tabuleiro {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		int linhas;
		
		System.out.print("Escolha o numero de linhas: ");
		linhas = sc.nextInt();
		
		for (int i = 0; i < linhas; i++) {
				System.out.println("__________");
		}
			
		sc.close();
	}

}
