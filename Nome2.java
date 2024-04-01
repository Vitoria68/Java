package principal;

import java.util.Scanner;

public class Nome2 { 

	public static void main(String[] args) { 
       Scanner teclado = new Scanner(System.in);
       String nome, sobrenome;
       
       System.out.println("Qual é o seu nome?");
       nome = teclado.nextLine();
       
       System.out.println("E seu sobrenome?");
       sobrenome = teclado.nextLine();
       
       System.out.print("Olá " + nome + " " + sobrenome + ", seja bem-vindo ao programa!!");
       
       teclado.close();
	}

}
