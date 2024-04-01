package principal;

import java.util.Scanner;

public class Moedas {
	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int c10, c50;
		double total;
		
		System.out.println("Quantas moedas de 10 centavos você tem?");
		c10 = teclado.nextInt ();
		
		System.out.println("Quantas moedas de 50 centavos você tem?");
		c50 = teclado.nextInt ();
		
		total = (c10 * 0.1) + (c50 * 0.5);
		
		System.out.println("Você possui: R$ " + total);
		
		teclado.close();

    }
}