package principal;

import java.util.Scanner;

public class CampeonatoVet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String classificado[] = {"vasco", "atletico", "cruzeiro", "palmeiras", "fluminense"};
		String time;
		
		System.out.print("Qual é o seu time? ");
		time = sc.nextLine();
		
		for (int i = 0; i < classificado.length; i++) {
			 if (classificado[i].equals(time)) {
				 System.out.println("Parabéns, o seu time está entre os 5 classificados!");
				 System.out.println("Ele está na posição " + i + 1 + ".");
				 break;
			 }
		}
		
		sc.close();
	}

}
