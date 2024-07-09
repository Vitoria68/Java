package principal;

import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 
        double q1, q2, lado1, lado2;

        System.out.println("Informe o lado do primeiro quadrado:");
        lado1 = teclado.nextDouble();

        System.out.println("Informe o lado do segundo quadrado:");
        lado2 = teclado.nextDouble();

        q1 = lado1 * 2;
        q2 = lado2 * 2;

        System.out.printf("A area do primeiro quadrado é %.0f e o do segundo é %.0f.", q1, q2);

        System.out.println();
        if (q1 == q2) {
        	System.out.println("Os quadrados têm áreas iguais.");
            }
        else {
        	System.out.println("Os quadrados têm áreas diferentes.");
        }
        
       teclado.close();
	}

}
