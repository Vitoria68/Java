package principal;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Escolha um numero: ");
		num = sc.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.print( i + " x " + num + " = " + i*num);
			if ( i*num % 2 == 0) {
				System.out.print(" (número par)\n");
			}
			else {
				System.out.print(" (número ímpar)\n");
			}
		}
		
		sc.close();
	}

}
