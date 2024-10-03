package principal;

import java.util.Scanner;

public class OperacoesMatematicas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int escolha;
		
		System.out.print("Qual operacão voce deseja executar? Digite 1 para soma e 2 para subtracão: ");
		escolha = sc.nextInt();
		
		if (escolha == 1) {
			soma();
		}
		else if (escolha == 2) {
			subtracao();
		}
		
		sc.close();
	}

	static void soma() {
		Scanner sc = new Scanner(System.in);
		double num1, num2, soma;
		
		System.out.print("Informe o primeiro número: ");
		num1 = sc.nextDouble();
		
		System.out.print("Informe o segundo número: ");
		num2 = sc.nextDouble();
		
		System.out.print("A soma dos dois números é: ");
		soma = num1 + num2;
		System.out.print(soma);
		
		sc.close();
	}
	
	static void subtracao() {
		Scanner sc = new Scanner(System.in);
		double num1, num2, sub;
		
		System.out.print("Informe o primeiro número: ");
		num1 = sc.nextDouble();
		
		System.out.print("Informe o segundo número: ");
		num2 = sc.nextDouble();
		
		System.out.print("A subtração dos dois números é: ");
		sub = num1 - num2;
		System.out.print(sub);
		
		sc.close();
	}
}