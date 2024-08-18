package principal;

import java.util.Scanner;

public class ParDivisivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 200; i++) {
			if (i % 2 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
		
		
		sc.close();
	}

}
