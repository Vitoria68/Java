package principal;

import java.util.Scanner;

public class Usuario { 

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String nome, senha;
		
		System.out.print("Qual o nome do usuario? ");
		nome = sc.nextLine();
		
		System.out.print("Qual a senha do usuario? ");
		senha = sc.nextLine();
				
		System.out.println(login(nome, senha));
		
		sc.close();
	}
	
	static boolean login(String nome, String senha) {
		if( nome.equals("paulo") && senha.equals("abc123") ) {
		 return true;
		}
		 else {
		 return false;
		}
	}
	
}
