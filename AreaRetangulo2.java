package principal;

import java.util.Scanner;

public class AreaRetangulo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome, senha; 

		System.out.print("Qual o nome do usuario? ");
		nome = sc.nextLine();

		System.out.print("Qual a senha do usuario? ");
		senha = sc.nextLine();

		if (login(nome, senha) == true) {
			System.out.println("Usuário autenticado.\n");

			double lado, altura;

			System.out.print("Qual o lado do retangulo? ");
			lado = sc.nextDouble();

			System.out.print("Qual a altura do retangulo? ");
			altura = sc.nextDouble();

			System.out.println("A area do retangulo eh: " + area(lado, altura));
		}
		else {
			System.out.println("Usuário e/ou senha incorretos.\n");
		}

		sc.close();
	}

	static boolean login(String nome, String senha) {
		if (nome.equals("paulo") && senha.equals("abc123")) {
			return true;
		} else {
			return false;
		}
	}

	static double area(double n1, double n2) {

		return n1 * n2;
	}

}
