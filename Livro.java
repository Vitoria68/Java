package principal;

import java.util.Scanner;

public class Livro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int quant;
		double a, b;
		
		System.out.print("Informe a quantidade de livros que você deseja comprar: ");
		quant = teclado.nextInt();
		
		a = quant * 0.25 + 7.50;
		b = quant * 0.50 + 2.50;
		
		if ( a == b) {
			System.out.println("Não há diferença entre os valores.");
		}
		else if (a > b) {
			System.out.println("O critério B é a melhor opção de desconto.");
		}
		else {
			 System.out.println("O critério A é a melhor opção de desconto.");
		}
		
		teclado.close();

	}

}
