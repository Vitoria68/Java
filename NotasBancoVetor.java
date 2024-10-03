package principal;

import java.util.Scanner;

public class NotasBancoVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int valor, cem = 0, cinquenta = 0, vinte = 0, dez = 0, cinco = 0, dois = 0;;
		
		System.out.print("Qual o valor inteiro a ser sacado da conta bancária? " );
		valor = sc.nextInt();
		
		while (valor >= 100) {
			valor -= 100;
			cem++;
		}
		while (valor >= 50 && valor < 100) {
			valor -= 50;
			cinquenta++;
		}
		while (valor >= 20 && valor < 50) {
			valor -= 20;
			vinte++;
		}
		while (valor >= 10 && valor < 20) {
			valor -= 10;
			dez++;
		}
		while (valor >= 5 && valor < 10) {
			valor -= 5;
			cinco++;
		}
		while (valor >= 2 && valor < 5) {
			valor -= 2;
			dois++;
		}
		
		System.out.println("O valor de cada nota eh: " + cem + " notas de 100, "  + cinquenta + " notas de 50, " + vinte + " notas de 20, " + dez + " notas de 10, " + cinco + " notas de 5 e " + dois + " notas de dois."                              );
		
		sc.close();
	}

}
