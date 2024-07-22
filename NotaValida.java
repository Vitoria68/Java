package principal;

import java.util.Scanner;

public class NotaValida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota;
		
		System.out.print("Digite sua nota de final de semestre: ");
		nota = sc.nextDouble();

		if (nota > 0 && nota <= 10) {
			System.out.print("Sua nota de final de semestre é válida.\n");
		}
		else {
			System.out.print("Sua nota de final de semestre não é válida.\n");
		}
		
		if (nota >= 6 && nota < 10) {
			System.out.println("Você foi aprovado!");
		}
		else if (nota >= 3 && nota < 6) {
			System.out.println("Você vai ter que passar pela prova final.");
		}
		else if (nota < 3 && nota > 0) {
			System.out.println("Você foi reprovado...");
		}
		
		sc.close();
	}

}
