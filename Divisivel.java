package principal;

import java.util.Scanner;

public class Divisivel {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double num;
		
		System.out.print("Informe um número: ");
		num = teclado.nextDouble();
		
		if (num % 10 == 0) {
			System.out.println("O número é divisível por 10.");
		}
		else {
			 System.out.println("O número não é divisível por 10.");
		}
		
		if (num % 5 == 0) {
			System.out.println("O número é divisível por 5.");
		}
		else {
			 System.out.println("O número não é divisível por 5.");
		}
		
		if (num % 2 == 0) {
			System.out.println("O número é divisível por 2.");
		}
		else {
			 System.out.println("O número não é divisível por 2.");
		}


		
		teclado.close();

	}

}
