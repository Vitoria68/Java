package principal;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        
		int lado1, lado2, area1, area2;
		boolean quadrado;
		
		System.out.print("Informe o lado do primeiro quadrado: ");
		lado1 = teclado.nextInt();
		
		System.out.print("Informe o lado do segundo quadrado: ");
		lado2 = teclado.nextInt();
		
		area1 = lado1 * lado1;
		area2 = lado2 * lado2;
		
		quadrado = area1 == area2;
		System.out.print("A área dos dois quadrados é a mesma? " + quadrado);
		
	teclado.close();
	}

}
