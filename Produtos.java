package principal;

import java.util.Scanner;

public class Produtos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String produtos[] = {"Livro", "Marcador", "Box", "Ecobag", "Post-it"};
		
		System.out.println("Produto 1: " + produtos[0]);
		System.out.println("Produto 2: " + produtos[1]);
		System.out.println("Produto 3: " + produtos[2]);
		System.out.println("Produto 4: " + produtos[3]);
		System.out.println("Produto 5: " + produtos[4]);
		
        sc.close();
	}

}
