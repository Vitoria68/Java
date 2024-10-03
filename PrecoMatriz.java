package principal;

import java.util.Scanner;

public class PrecoMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double precos[][] = {{2.2, 3.3}, {1.1, 4.4}, {5.5, 6.6}, {7.7, 8.8}};
		
		System.out.println("Semana 1, Produto 1: " + precos[0][0]);
		System.out.println("Semana 1, Produto 2: " + precos[0][1]);
		System.out.println("Semana 2, Produto 1: " + precos[1][0]);
		System.out.println("Semana 2, Produto 2: " + precos[1][1]);
		System.out.println("Semana 3, Produto 1: " + precos[2][0]);
		System.out.println("Semana 3, Produto 2: " + precos[2][1]);
		System.out.println("Semana 4, Produto 1: " + precos[3][0]);
		System.out.println("Semana 4, Produto 2: " + precos[3][1]);
		
		sc.close();
	}

}
