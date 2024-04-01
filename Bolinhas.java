package principal;

import java.util.Scanner;

public class Bolinhas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double gramas, peso;
		int quant;

		System.out.println("Quantas gramas pesa cada bolinha?");
		gramas = teclado.nextInt();
		
		System.out.println("Qual é a quantidade de bolinhas na piscina?");
		quant = teclado.nextInt();
		
		peso = (gramas * quant) / 1000.0;
		
		System.out.println("Peso total da piscina em kg: " + peso);
		
		teclado.close();
		
	}

}
