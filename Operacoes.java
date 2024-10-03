package principal;

import java.util.Scanner;

public class Operacoes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2, numero3;
		
		String op;
		
		System.out.print("Informe o primeiro número: ");
		numero1 = teclado.nextInt();
		
		System.out.print("Informe o segundo número: ");
		numero2 = teclado.nextInt();
		
		System.out.print("Informe o terceiro número: ");
		numero3 = teclado.nextInt();
		
		System.out.print("Qual operação deseja fazer ( + ou - )? ");
		op = teclado.next();
		
		if (op.equals("+"))
			soma(numero1, numero2, numero3);
		else
			subtracao(numero1, numero2, numero3);
		teclado.close();
	}
	
	    static void soma(int n1, int n2, int n3) {
		 System.out.println("A soma dos números é: " + (n1 + n2 + n3));
		}
		static void subtracao(int n1, int n2, int n3) {
		 System.out.println("A subtração dos números é: " + (n1 - n2 - n3));
		}

}
