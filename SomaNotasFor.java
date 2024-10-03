package principal;

import java.util.Scanner;

public class SomaNotasFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int notas[] = { 1, 2, 4, 5, 7, 9 };
		int soma = 0;
		
		for(int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		
		 System.out.println("Média das notas: " + (soma/notas.length));
		
		sc.close();
	}

}
 