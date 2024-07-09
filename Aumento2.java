package principal;

import java.util.Scanner;

public class Aumento2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 
        int anos;

        System.out.println("Informe quantos anos de serviço você tem:");
        anos = teclado.nextInt();

        boolean aumento = (anos > 5);
        
        if (aumento == true) {
        	System.out.println("Parabéns, você terá aumento!");
        }
        else {
        	System.out.println("Poxa, você não terá aumento...");
        }
        
       teclado.close();
	}

}
