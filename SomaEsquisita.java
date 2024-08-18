package principal;

import java.util.Scanner;

public class SomaEsquisita {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, resultado = 0;
		
		System.out.print("Informe dois números: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		while (num1 > 0) {
			resultado += num2;
			num1--;
		}
		
		System.out.print("A multiplicação do primeiro pelo segundo número é: " + resultado + ".");
		
		sc.close();
	}

}
