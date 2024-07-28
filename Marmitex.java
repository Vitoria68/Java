package principal;

import java.util.Scanner;

public class Marmitex { 
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String bairro; 
		int quant;
		double valor = 0;
		
		System.out.println("Bem-vindo ao servico de entrega do restaurante!");
		System.out.print("Por favor, informe o seu bairro: ");
		bairro = sc.nextLine(); 
		bairro = bairro.toLowerCase();
		
		System.out.print("Por favor, informe quantas marmitex voce ira querer: ");
		quant = sc.nextInt();
		
		switch(bairro) {
		  case "centro":
			  if (quant * 20 < 100) {
			      valor = (20 * quant) + 2.00;
			  }
			  else {
		          valor = (20 * quant); 
			  }
			  break;
		  case "baixada":
			  valor = (20 * quant) + 1.50;			
			  break;
		  case "colina":
			  valor = (20 * quant) + 2.50;
			  break; 
		  case "alfa sul":
			  if (quant * 20 < 150) {
				  valor = (20 * quant) + 3.00;
				  }
				  else { 
					  valor = (20 * quant);
				  }
			  break;
		  default:
			  System.out.println("Sinto muito, mas ainda não estamos fazendo entregas neste bairro...");
		}
		      System.out.print("O preco da entrega sera: R$" + valor);
		sc.close();
	}

}
