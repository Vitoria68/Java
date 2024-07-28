package principal;

import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    double imc, peso, altura;
    
    System.out.println("************* CALCULADORA *************");
    System.out.println("****************** DE *****************");
    System.out.println("****************** IMC ****************");
    
    System.out.print("\nInforme o seu peso para cálculo do IMC: ");
    peso = teclado.nextDouble();
    
    System.out.print("\nInforme a sua altura para cálculo do IMC: ");
    altura = teclado.nextDouble();
    
    
    imc = peso/(altura * altura);
  
    System.out.printf("\nO valor do seu IMC é: %.2f", imc);
    
    teclado.close();
	}

}
