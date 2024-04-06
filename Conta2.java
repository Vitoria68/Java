package principal;

import java.util.Scanner;

public class Conta2 {

	public static void main(String[] args) {
	//comando para configurar os comandos de entrada de dados
    Scanner teclado = new Scanner(System.in);
    //declaração da variável que irá armazenar o valor
         double num;
    //exibe mensagem para usuário solicitando que ele informe o valor    
         System.out.print("Informe o número para que seja calculado o dobro: ");
    
    //comando de entrada de dados que recebe o valor
         num = teclado.nextDouble();
         
    //calcula o dobro do valor informado
         num *= 2;
         
    //exibe o valor calculado com duas casas decimais    
         System.out.printf("\nDobro do número informado: %.2f", num);
 
   //finaliza o comando de entrada de dados
    teclado.close();

	}

}
