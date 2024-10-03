package principal;

import java.util.Scanner;

import java.lang.Math;

public class TemperaturaVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double [] temp = new double [7];
		double media, soma = 0, dist = 0, maior = 0;
		
		System.out.println("Informe as temperaturas medidas ao longo de cada dia da semana anterior: ");
		
		for (int i = 0; i < temp.length; i++) { 
			temp[i] = sc.nextDouble();
			soma = soma + temp[i];
		}
		
		media = soma / 7; 
		
		for (int i = 0; i < temp.length; i++) {
			dist = temp[i] - media;
			if (dist > maior) {
				maior = dist;
			}
		}
		
		System.out.println("A média das temperaturas registradas foi " + media);
		System.out.println("O valor mais distante da média das temperaturas é " + 	Math.abs(dist));
		
		sc.close();
	}

}
