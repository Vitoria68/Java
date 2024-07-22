package principal;

import java.util.Scanner;

public class Comissao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double fixo, vendas, salario;
				
		System.out.print("Qual o seu salario fixo? ");
		fixo = sc.nextDouble();
		System.out.print("Qual o valor das vendas que voce efetuou? ");
		vendas = sc.nextDouble();

		if (vendas <= 1500) {
			salario = vendas * 0.97 + fixo;
		}
		else {
			salario = 1500 * 0.97 + (vendas - 1500) * 0.95 + fixo;
		}
		
		System.out.printf("O seu salario total sera de R$%.2f", salario);
		
		sc.close();
	}

}
