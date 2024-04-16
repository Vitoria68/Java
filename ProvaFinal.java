package principal;

import java.util.Scanner;

public class ProvaFinal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double nota1, nota2, nota3, media, nota, finaal;
		
		System.out.print("Informe a nota do aluno na primeira prova: ");
		nota1 = teclado.nextDouble();
		System.out.print("Informe a nota do aluno na segunda prova: ");
		nota2 = teclado.nextDouble();
		System.out.print("Informe a nota do aluno na terceira prova: ");
		nota3 = teclado.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		
		if (media >= 6.0) {
			System.out.println("O aluno não ficou de prova final.");
		}
		else {
			System.out.println("O aluno ficou de prova final.");
			System.out.print("Informe a nota da prova final: ");
			nota = teclado.nextDouble();
			
			finaal = (media + nota)/ 2; 
			
			if (finaal >= 5.0) {
				System.out.println("O aluno foi aprovado.");
			}
			else {
				System.out.println("O aluno não foi aprovado.");
			}
		}
		
		teclado.close();
	}

}
