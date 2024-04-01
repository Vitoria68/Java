package principal;

import java.util.Scanner;

public class DivisaoConta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double valor, valorCada;
		int pessoas;
		
		System.out.println("Qual foi o valor da conta?");
		valor = teclado.nextDouble();
		
		System.out.println("Qual é a quantidade de pessoas na mesa?");
		pessoas = teclado.nextInt();
		
		valorCada = valor / pessoas;
		System.out.println("Valor por pessoa: R$" + valorCada);
		

        teclado.close();
	}

}
