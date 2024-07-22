package principal;

import java.util.Scanner;

public class Brinquedo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade;
		double altura;
		
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		System.out.print("Digite sua altura em metros: ");
		altura = sc.nextDouble();

		if (idade > 15 && altura > 1.6) {
			System.out.printf("Você poderá usar o brinquedo.\n");
		}
		else {
			System.out.printf("Você não poderá usar o brinquedo.\n");
		}
		
		sc.close();
	}

}
