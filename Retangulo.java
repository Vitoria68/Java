package principal;

import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        double base, altura, area, perimetro, diagonal;
        
        System.out.println("Base do retângulo: ");
        base = teclado.nextDouble();
        
        System.out.println("Altura do retângulo: ");
        altura = teclado.nextDouble();
        
        area = base * altura;
        perimetro = (base * 2) + (altura * 2);
        diagonal = Math.sqrt(Math.pow(altura, 2.0) + Math.pow(base, 2.0));
        
        System.out.println("AREA = " + String.format("%.4f", area));
        System.out.println("PERIMETRO = " + String.format("%.4f", perimetro));
        System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));
        
        teclado.close();
	}

}


		           
		  
		
