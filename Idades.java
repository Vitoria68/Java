package principal;

import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nome1, nome2;
		double idade1, idade2, media;
		
		System.out.println("Dados da primeira pessoa: ");
		System.out.print("Nome: ");
		nome1 = teclado.nextLine();
		System.out.print("Idade: ");
		idade1 = teclado.nextInt();
		
		teclado.nextLine();
		
		System.out.println("Dados da segunda pessoa: ");
		System.out.print("Nome: ");
		nome2 = teclado.nextLine();
		System.out.print("Idade: ");
		idade2 = teclado.nextInt();
		
		media = (idade1 + idade2)/ 2;
		
		System.out.printf("A idade media de %s e %s eh de %.1f anos", nome1, nome2, media);
		
		teclado.close();

	}

}
