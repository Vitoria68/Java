package principal;

import java.util.Scanner;

public class ImparesFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("Números ímpares: ");
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				System.out.println(num[i]);
			}
		}
		
		sc.close();
	}

}
