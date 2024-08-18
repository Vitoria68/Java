package principal;

import java.util.Scanner;

public class MaiorIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade, contagem = 0, maior = 0;
		
		while (contagem < 10) {
			System.out.print("Digite a idade da pessoa: ");
			idade = sc.nextInt();
			contagem++;
			
			if (idade >= 18) {
				maior++;
			}
		}
		 
		System.out.println("Há " + maior + " pessoa(s) maior(es) de idade. ");
		
		sc.close();
	}

}
