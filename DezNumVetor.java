package principal;

import java.util.Scanner;

public class DezNumVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] vet = {1, -2, 3, 4, 5, -6, 7, 8, 9, 10};
		int positivo = 0, negativo = 0, par = 0, impar = 0, divisivel = 0;
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > 0) {
				positivo++;
			}
			else {
				negativo++;
			}
			if (vet[i] % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
			if  (vet[i] % 5 == 0) { 
				divisivel++;
			}
		}
		
		System.out.println( positivo + " destes numeros são positivos, " + negativo + " negativos, " + par + " pares, " + impar + " impares e " + divisivel + " divisiveis por cinco.");      
		
		sc.close();
	}

}
