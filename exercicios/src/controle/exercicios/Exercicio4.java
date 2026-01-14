/*  4. Criar um programa que receba um número e diga se ele é um número primo. */
package controle.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int contadorDeDivisores = 0;

		System.out.print("Digite um número: ");
		int numero = scan.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		if(contadorDeDivisores == 0) {
			System.out.printf("%d é primo", numero);
		}else {
			System.out.printf("%d não é primo", numero);
		}
		
		scan.close();
	}
}
