package principal;

import java.util.Scanner;

public class Contagem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contagem = 1;
		int max;

		System.out.print("Quantos números primeiros múltiplos de 4 você quer ver?");
		max = sc.nextInt();

		while (contagem <= max) {
			System.out.println("12 primeiros múltiplos de 4: " + contagem * 4);
			contagem++; // atualização da condição
		}

		sc.close();

	}

}
