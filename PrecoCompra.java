package principal;

import java.util.Scanner;

public class PrecoCompra {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int quant1, quant2, quant3;
		double valor1, valor2, valor3, preco;
		
		System.out.println("Informe a quantidade do produto 1: ");
		quant1 = teclado.nextInt();
		
		System.out.println("Informe a quantidade do produto 2: ");
		quant2 = teclado.nextInt();
		
		System.out.println("Informe a quantidade do produto 3: ");
		quant3 = teclado.nextInt();
		
		System.out.println("Informe o valor do produto 1: ");
		valor1 = teclado.nextDouble();
		
		System.out.println("Informe p valor do produto 2: ");
		valor2 = teclado.nextDouble();

		System.out.println("Informe o valor do produto 1: ");
		valor3 = teclado.nextDouble();
		
        preco = (quant1 * valor1) + (quant2 * valor2) + (quant3 * valor3);
        System.out.println("Valor total da compra: R$" + preco);
		
        teclado.close();
		

	}

}
