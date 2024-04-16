package principal;

import java.util.Scanner;

public class DescontoFinal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double valor, valorFinal;
		
		System.out.print("Informe o valor do produto a ser adquirido: ");
		valor = teclado.nextDouble();
		
		if (valor > 300.00) {
			valorFinal = valor * 0.75;
		}
		else {
			valorFinal = valor;
		}
			
			 System.out.printf("O valor final do produto é: R$%.2f", valorFinal);
		
		teclado.close();

	}

}
