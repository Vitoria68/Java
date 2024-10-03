package principal;

import java.util.Scanner;

public class TabelaMatriz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tabela [][] = { { 12, 88, 64 }, { 10, 19, 66 }, { 25, 17, 15 }, { 30, 25, 99 }, { 45, 55, 20 } };
		int soma = 0, qnt;
		double media;
		
		for (int i = 0; i < tabela.length; i++) {
			for (int j = 0; j < tabela[0].length; j++) {
				soma += tabela[i][j];
			}
		}
		
		System.out.println(" A soma de todos os elementos é: " + soma);
		 
		qnt = tabela.length * tabela[0].length;// quantidade = área = base * altura = linha * coluna
		media = soma/qnt; 
		
		System.out.println(" A média de todos os elementos é: " + media);
		
		sc.close();
	}

}
