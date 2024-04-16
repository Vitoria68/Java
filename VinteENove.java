package principal;

import java.util.Scanner;

public class VinteENove {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		System.out.print("Informe um número inteiro: ");
		num = teclado.nextInt();
		
		if (num <= 20 || num >= 90) {
			System.out.println("O número está fora do intervalo de 20 a 90.");
		}
		
		teclado.close();
	}

}
