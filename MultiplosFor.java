package principal;

import java.util.Scanner;

public class MultiplosFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 12; i++) {
			System.out.println("12 primeiros multiplos de 4: " + i*4);
		}
		
		sc.close();
	}

} 
