package principal;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, fatorial = 1;
		
		System.out.print("Informe um número: ");
		num = sc.nextInt();
		
		while (num > 0 ) {
			fatorial*= num;
			num--;
		}
		
		System.out.print("O fatorial do número informado é " + fatorial + ".");
		
		sc.close();
	}

}
