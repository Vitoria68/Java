package principal;

import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int quant, j;
		double media, soma;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		quant = teclado.nextInt();
		
		double[] vet = new double [quant];
		
		for (int i = 0; i < quant; i++) {
		System.out.print("Digite um numero: ");
		vet[i] = teclado.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALORES =  ");
		for (int i = 0; i < quant; i++) {
			System.out.print(String.format("%.1f", vet[i]) + " ");
		}
		System.out.println();
		
		System.out.print("SOMA =  ");
		soma = 0;
		for (int i = 0; i < quant; i++) {
				soma = soma + vet [i];
		}
		System.out.print(String.format("%.2f", soma));
		
		System.out.println();
		media = soma / quant;
		System.out.println("MEDIA = " + String.format("%.2f", media));
		
		teclado.close();
	}

}
