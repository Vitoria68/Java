package principal;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu, quadrado, triangulo;
		
		System.out.println("Menu Prinicipal: 1) Quadrilátero 2) Triângulo.");
		menu = sc.nextInt();
		
		while (menu != 1 || menu != 2) {
			System.out.println("Você digitou uma resposta inválida.");
			System.out.println("Menu Prinicipal: 1) Quadrilátero 2) Triângulo.");
			menu = sc.nextInt();
		}
	    while (menu == 1) {
			System.out.println("Menu Secundário do Quadrilátero: 1) Quadrado 2) Retângulo 3) Trapézio 4) Voltar.");
			quadrado = sc.nextInt();
		}
		if (menu == 2) {
			System.out.println("Menu Secundário do Triângulo: 1) Equilátero 2) Isosceles 3) Escaleno 4) Voltar.");
		}
		
		sc.close();
	}

}
