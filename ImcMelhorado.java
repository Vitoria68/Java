package principal;

import java.util.Scanner;

public class ImcMelhorado {

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
  
    System.out.printf("\nO valor do seu IMC é: %.2f\n", imc);
    System.out.println("");
    
    System.out.println("**********************************************************");
    System.out.println("|   CLASSIFICAÇÃO                           |      IMC   |");
    System.out.println("|*******************************************|************|");
    System.out.println("|   ABAIXO DO PESO                          |   < 18,50  |");
    System.out.println("|   PESO NORMAL                             | 18,5 - 24,9|");
    System.out.println("|   SOBREPESO                               |   25 - 29,9|");
    System.out.println("|   OBESIDADE GRAU I                        |   30 - 34,9|");
    System.out.println("|   OBESIDADE GRAU II                       |   35 - 39,9|");
    System.out.println("|   OBESIDADE GRAU III OU MORBIDA           |     >= 40  |");
    System.out.println("**********************************************************");
    
    teclado.close();
	}

}
