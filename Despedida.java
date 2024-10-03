package principal;

import java.util.Scanner;

public class Despedida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Você passará por uma avaliação de idade para usar o programa!!");
		maioridade();
		despedida();
		
		sc.close();
	}

	static void maioridade() {
		Scanner teclado = new Scanner(System.in);
		int idade;
		System.out.print("Olá usuário!! Qual a sua idade? ");
		idade = teclado.nextInt();
		if (idade >= 18)
			System.out.println("Ok, você pode acessar o programa.");
		else
			System.out.println("Desculpe, você não poderá acessar o programa.");
		teclado.close();
	}

	static void despedida() {
		System.out.println("Tchauzin!");
	}

}
 