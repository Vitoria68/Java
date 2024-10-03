package principal;

import java.util.Scanner;

public class Matriz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int matriz[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
		int num, soma = 0;
		
		System.out.print("Informe um numero: ");
		num = sc.nextInt();
				
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j] ==  num) {
					soma++;
				}
			}
		}
		
		System.out.println(" O numero informado aparece na matriz " + soma + " vezes.");
		
		sc.close();
	}

}
