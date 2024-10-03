package principal;

import java.util.Scanner;

public class Operacoes3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero1, numero2, resultado;
		String op;
		
		System.out.print("Informe o primeiro número: ");
		numero1 = teclado.nextInt();
		
		System.out.print("Informe o segundo número: ");
		numero2 = teclado.nextInt();
		
		System.out.print("Qual operação deseja fazer ( * ou / )? ");
		op = teclado.next();
		
		if (op.equals("*")) {
			resultado = multiplicacao(numero1, numero2);
			System.out.println("Resultado da multiplicação: " + resultado);
		} else {
			resultado = divisao(numero1, numero2);
			System.out.println("Resultado da multiplicação: " + resultado);
		}
		
		teclado.close();
	}

	static int multiplicacao(int n1, int n2) {
		return n1 * n2;
	}

	static int divisao(int n1, int n2) {
		return n1 / n2; 
	}

}
