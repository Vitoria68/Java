package principal;

public class Parcela {

	public static void main(String[] args) {
	       
		   double carro = 75000;
		   int parcelas = 12;
		   double juros = 0.2;
		   
		   double financiamento = carro*( 1 + juros);
		   double cadaParcela = financiamento / parcelas;
		   
		   System.out.println("Valor total do financiamento: " + financiamento);
		   System.out.println("Valor de cada prestação: " + cadaParcela);

	}

}
