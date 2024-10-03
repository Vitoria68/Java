package principal;

import java.util.Scanner;

public class TabelaMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int linha;
		
		int tabela[][] = { {12, 88, 64}, {10, 19, 66}, {25, 17, 15}, {30, 25, 99}, {45, 55, 20} };
		
		System.out.print("Qual a linha voce gostaria de visualizar? ");
		linha = sc.nextInt();
		
		System.out.println("Elementos da linha " + linha);
		System.out.println(tabela[linha-1][0]);
		System.out.println(tabela[linha-1][1]);
		System.out.println(tabela[linha-1][2]);
		
		sc.close();
	}

}
