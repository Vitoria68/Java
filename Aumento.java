package principal;

import java.util.Scanner;

public class Aumento {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        
		int anos;
		boolean aumento;
		
		System.out.print("Informe quantos anos de serviço o funcionário tem: ");
		anos = teclado.nextInt();
		
		aumento = anos > 5;
		
		if (aumento == true) {
			System.out.print("O funcionário terá aumento.");
		}
		else {
			System.out.print("O funcionário não terá aumento." );
		}
		
	teclado.close();
	}

}

