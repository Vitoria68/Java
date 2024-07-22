package principal;

import java.util.Scanner;

public class Xadrez {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		int inicio, fim, x, temp;
				
		System.out.print("Qual o horário do início do jogo? ");
		inicio = sc.nextInt();
		System.out.print("Qual o horário do fim do jogo? ");
		fim = sc.nextInt();

		if (inicio < 0|| fim < 0) {
		    System.out.println("Horário inválido, digite novamente.");
		}
		else if (inicio > fim) {
			x = inicio;
			inicio = fim;
			fim = x;
			
			temp = fim - inicio;
			System.out.printf("O jogo de xadrez durou %d horas.", temp);
		}
		else {
			temp = fim - inicio;
			System.out.printf("O jogo de xadrez durou %d .", temp);
		}
		
		sc.close();
	}

}
