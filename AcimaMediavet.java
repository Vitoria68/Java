package principal;

import java.util.Scanner;

public class AcimaMediavet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double precos[] = new double[5];
		
		for (int i = 1; i <=  precos.length; i++) {
			System.out.print("Informe o preço do produto " + i + ": ");
			precos[i-1] = sc.nextDouble();
		}
		
		System.out.println("Preços informados: ");
		for (int i = 0; i < precos.length; i++) {
			System.out.println(precos[i]);
			}
		
		sc.close();
	}

}
