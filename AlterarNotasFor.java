package principal;

import java.util.Scanner;

public class AlterarNotasFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int notas[] = { 1, 2, 4, 5, 7, 9 };
		int nota, valor;
		
		System.out.println("Qual nota você deseja corrigir? ");
		nota = sc.nextInt();
		
		System.out.println("Qual o valor na nova nota? ");
		valor = sc.nextInt(); 
		
		System.out.println("Notas antes da correção: ");
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		System.out.println("Notas após da correção: ");
		notas[nota - 1] = valor;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		sc.close();
	}

}
