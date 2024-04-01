package principal;

import java.util.Scanner;

public class Nome { 

	public static void main(String[] args) { 
       Scanner teclado = new Scanner(System.in);
       String nome;
       
       System.out.println("Qual é o seu nome?");
       nome = teclado.nextLine();
       
       System.out.print("Olá " + nome + ", seja bem-vindo ao programa!!");
       
       teclado.close();
	}

}
