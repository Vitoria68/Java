package principal;

import java.util.Scanner;

public class SaldoAtual {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double saldo, debito, credito, saldoat;
				
		System.out.print("Qual o seu saldo? ");
		saldo = sc.nextDouble();
		System.out.print("Qual o debito? ");
		debito = sc.nextDouble();
		System.out.print("Qual o credito? ");
		credito = sc.nextDouble();

		saldoat = saldo + credito - debito;
		
		System.out.printf("O seu saldo atual eh de R$%.2f.\n", saldoat);
		
		if (saldoat >= 0) {
			System.out.println("Saldo Positivo");
		}
		else {
			System.out.println("Saldo Negativo");
		}
		
		sc.close();
	}

}
