package principal;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double litros, valor;
		char comb;
				
		System.out.print("Quantos litros serão vendidos? ");
		litros = sc.nextDouble();
		System.out.print("Qual o tipo de combustivel?(Digite 'E' para etanol e 'G' para gasoliona)");
	    comb = sc.next().charAt(0);

		if (comb == 'E') {
			if (litros <= 20) {
				valor = litros * 5.90 * 0.97;
			}
			else {
				valor = litros * 5.90 * 0.95;
			}
		}
		else if (comb == 'G') {
			 if (litros <= 20) {
					valor = litros * 7.90 * 0.96;
				}
				else {
					valor = litros * 7.90 * 0.94;
				} 
			}
		else {
			System.out.println("Insira uma opcão valida.");
			valor = 0;
		}
		
		System.out.printf("O cliente deve pagar R$%.2f.\n", valor);
		
		sc.close();
	}

}
