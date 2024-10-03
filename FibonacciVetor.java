package principal;

import java.util.Scanner;

public class FibonacciVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, n = 0;
		
		System.out.print("Quantos números da sequência de Fibonacci você quer ver?");
		num = sc.nextInt();
		
		int [] fibo = new int [num];
		
	    for(int i = 0; i <= fibo.length; i++) {
	    	n = fibo[i + 1];
		    if (n < 2) {
               System.out.println(n);
               n++;
            } 
		    else {
		    	System.out.print((n - 1) + (n - 2));
             } 
		    n++;
           }

	sc.close();
}
}


