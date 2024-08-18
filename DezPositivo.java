package principal;

import java.util.Scanner;

public class DezPositivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, numero = 0, maior = 0, menor = 10000000, contagem = 0, soma = 0;
		double  media = 0;

		while (numero != -1) {
				System.out.print("Informe um número positivo: ");
				num = sc.nextInt();

				if (num == -1) {
					numero = num;
				}
				
				if (num > maior) {
					maior = num;
				}
				
				if (num < menor) {
					menor = num;
				}
				
				if (num != -1) {
					contagem++;
					soma = soma + num;
				}
			    media = (double) soma / contagem;
		}
 
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
		System.out.println("A média é: " + media);
		
		sc.close();
	}

}
