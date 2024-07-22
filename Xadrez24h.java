package principal;

import java.util.Scanner;

public class Xadrez24h {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		int inicio, fim, temp;
				
		System.out.print("Qual o horário do início do jogo? ");
		inicio = sc.nextInt();
		System.out.print("Qual o horário do fim do jogo? ");
		fim = sc.nextInt();

		if( (inicio > 0) && (fim > 0) ) { 
		     if(inicio < fim) {
		          temp = fim - inicio; 
		     }
		    else {
		          temp = (24 - inicio) + fim; 
		    }

		System.out.print("Tempo de duração do jogo foi de " + temp + " hora(s)."); 
		}  
		else {
		System.out.print("Você não informou valores corretos."); 
		}
		
		sc.close();
	}

}
