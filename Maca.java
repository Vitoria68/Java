package principal;

import java.util.Scanner;

public class Maca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quant;
		double valor;
		
		System.out.print("Quantas maçãs serão compradas? ");
		quant = sc.nextInt();

		if (quant >= 12) {
		    valor = quant * 1.00;
		}
		else {
			valor = quant * 1.30;
		}
		
		System.out.printf("O custo da compra será R$%.2f", valor);
		
		sc.close();
	}

}
