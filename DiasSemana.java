package principal;

import java.util.Scanner;

public class DiasSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um número de 1 a 7:");
		num = sc.nextInt();
		
		switch(num) {
		  case 1:
			  System.out.println("Este número corresponde ao domingo.");
			  break;
		  case 2:
			  System.out.println("Este número corresponde a segunda-feira.");
			  break;
		  case 3:
			  System.out.println("Este número corresponde a terça-feira.");
			  break;
		  case 4:
			  System.out.println("Este número corresponde a quarta-feira.");
			  break;
		  case 5:
			  System.out.println("Este número corresponde a quinta-feira.");
			  break;
		  case 6:
			  System.out.println("Este número corresponde a sexta-feira.");
			  break;
		  case 7:
			  System.out.println("Este número corresponde ao sábado.");
			  break;
		  default:
			  System.out.println("Você não informou um número válido.");
			  System.out.println("As opções são apenas de 1 a 7.");
		}
		
		sc.close();
	}

}
