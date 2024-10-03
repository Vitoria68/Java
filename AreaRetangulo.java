package principal;

import java.util.Scanner;

public class AreaRetangulo {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		double lado, altura;
		
		System.out.print("Qual o lado do retangulo?");
		lado = sc.nextDouble();
		
		System.out.print("Qual a altura do retangulo?");
		altura = sc.nextDouble();
		
		System.out.println("A area do retangulo eh: " + area(lado, altura));
		
		sc.close();
	}
	
	static double area(double n1, double n2) {
		
		return n1 * n2; 	
	}

}
