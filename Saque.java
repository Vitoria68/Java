package principal;

import java.util.Scanner;

public class Saque {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double saldo, saque;
		int qtdSaques = 0;
		
		System.out.print("Qual o seu saldo bancário? ");
		saldo = teclado.nextDouble();
		System.out.print("Qual o valor do saque?");
		saque = teclado.nextInt();
		
		while (saldo >= saque) {
			saldo = saldo - saque; // atualização da condição
			qtdSaques++;
		}
		
		System.out.println("Você poderá fazer " + qtdSaques + " saques de " + saque + " reais");
		teclado.close();
	}

}
