package principal;

import java.util.Scanner;

public class Decrescente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b;
		
		System.out.print("Digite dois numeros: ");
		a = sc.nextDouble();
		b = sc.nextDouble();

		if (a > b) {
			System.out.printf("%.0f  %.0f\n",a, b);
		}
		else {
			System.out.printf("%.0f  %.0f\n",b, a);
		}
		
		sc.close();
	}

}
