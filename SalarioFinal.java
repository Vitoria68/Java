package principal;

import java.util.Scanner;

public class SalarioFinal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double horas, salario;
		
		System.out.print("Informe quantas horas o funcionário trabalhou por mês:");
		horas = sc.nextDouble();
		
		if (horas <= 160.0) {
			salario = horas * 25.00;
		}
		else {
			 salario = 160.0 * 25.00 + (horas - 160.0) * 15.00;
		}
		
		System.out.printf("O salário final do funcionário é de: R$ %.2f", salario);
		
		sc.close();
	}

}
