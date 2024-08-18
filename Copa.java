package principal;

import java.util.Scanner;

public class Copa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ano = 2022, contagem = 1;
		
		while (contagem <= 4) {
			ano = ano + 4;
			System.out.printf("\nO ano das próximas copas será: %d", ano);
			contagem++;
		}
		
		
        sc.close();
	}

}
