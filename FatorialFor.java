package principal;

import java.util.Scanner;

public class FatorialFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, fatorial = 1; 
		
		System.out.print("Informe um numero: ");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			fatorial *= i;
		}
		
		System.out.println("Resultado do fatorial: " + fatorial);
		
		sc.close();
	}

}
