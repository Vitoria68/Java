package principal;

import java.util.Scanner;

public class NotasVetor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double [] notas = new double [10];	
		double media, soma = 0;
		
		System.out.print("Quais são suas notas? ");
		
		for (int i = 0; i < notas.length; i++) {
			notas[i] = sc.nextDouble();
			soma = soma + notas[i];
		}
		
		media= soma / 10;
		System.out.println("Notas acima da média: ");
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > media) {
				System.out.println(notas[i]);
			}
		}
		sc.close();


}


}
