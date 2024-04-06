package principal;

import java.util.Scanner;

public class Nome3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nome;
	
		System.out.print("Olá usuário, qual é o seu nome? ");
	
		nome = teclado.nextLine();
	
		System.out.printf("\nObrigado por informar o seu nome, %s.", nome);
	
		teclado.close();
	}

}
