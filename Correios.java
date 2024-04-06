package principal;

import java.util.Scanner;

public class Correios {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	double peso, taxa, cemGramas, valor;
	taxa = 4.50;
	cemGramas = 1.80;
	
	System.out.println("Informe o peso do volume em kg: ");
	peso = teclado.nextDouble();
	
	valor = ((peso * 10) * cemGramas) + taxa;
	
	System.out.printf("O valor da postagem é: R$%.2f", valor);
	
    teclado.close();
	}

}
