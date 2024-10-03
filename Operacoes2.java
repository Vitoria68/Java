package principal;

import java.util.Scanner;

public class Operacoes2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2;
		
		String op;
		
		System.out.print("Informe o primeiro número: ");
		numero1 = teclado.nextInt();
		
		System.out.print("Informe o segundo número: ");
		numero2 = teclado.nextInt();
		
		System.out.print("Qual operação deseja fazer ( x ou : )? ");
		op = teclado.next();
		
		if (op.equals("x"))
			multiplicacao(numero1, numero2);
		else
			divisao(numero1, numero2);
		teclado.close();
	}
	
	    static void multiplicacao(int n1, int n2) {
		 System.out.println("A multiplicacão dos números é: " + (n1 * n2));
		}
		static void divisao(int n1, int n2) {
		 System.out.println("A divisão dos números é: " + (n1 / n2));
		}
	}


