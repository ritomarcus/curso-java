// 1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par.
package controle.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		int n = scan.nextInt();

		if (n <= 10 && n >= 0) {
			if (n % 2 == 0) {
				System.out.println("O numero " + n + " está dentro do intervalo (0 e 10) e é par");
			} else {
				System.out.println("O numero " + n + "está dentro do intervalo (0 e 10) mas não é par");
			}
		} else {
			System.out.println("O numero " + n + " não está dentro do intervalo");
		}
		scan.close();
	}
}
