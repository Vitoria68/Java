package principal;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, resultado;
		String op;
		
		System.out.println("Informe o primeiro numero: ");
		n1 = sc.nextDouble(); 
		System.out.println("Informe o segundo numero: ");
		n2 = sc.nextDouble();
		System.out.print("Informe a operação ( +, -, *, /, % ): ");
		op = sc.next();
		
		switch(op) {
		  case "+":
			  resultado = n1 + n2;
			  break;
		  case "-":
			  resultado = n1 - n2;
			  break;
		  case "*":
			  resultado = n1 * n2;
			  break;
		  case "/":
			  resultado = n1 / n2;
			  break;
		  case "%":
			  resultado = n1 % n2;
			  break; 
		  default:
			  System.out.println("Você informou uma operação inválida.");
			  System.out.println("Somente são válidas as operações +, -, *, /, % .");
			  resultado = 0;			  
		}		
		
		System.out.println("Resultado da operação: " + resultado);
		
		sc.close();
	}

}

