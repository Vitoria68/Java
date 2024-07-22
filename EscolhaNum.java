package principal;

import java.util.Scanner;

public class EscolhaNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		System.out.print("Escolha um número de 1 a 3: ");
		numero = sc.nextInt();
		
		switch(numero){
		  case 1:
			  System.out.println("Você informou o número um.");
			  break;
			  case 2:
			  System.out.println("Você informou o número dois.");
			  break;
			  case 3:
			  System.out.println("Você informou o número três.");
			  break;
		}	
		sc.close();
	}

}
