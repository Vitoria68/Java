package principal;

import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double lado;
		 
		System.out.print("Informe o lado do quadrado: ");
		lado = sc.nextDouble();
		
		area(lado);
		
		sc.close();
	}
	
	static void area(double lado) {
		double area = lado * lado;
		System.out.printf("A area do quadrado eh: %.1f.", area);
	}
}
