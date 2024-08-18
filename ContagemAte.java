package principal;

import java.util.Scanner;

public class ContagemAte {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int contagem = 1;
		
		System.out.print("Informe um número qualquer:");
		num = sc.nextInt();
		
		while (contagem <= num) {
			System.out.println("Eis aqui a contagem até o " + num + ": " + contagem );
			contagem++;
		}
				
	    sc.close();
	}

}
