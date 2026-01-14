/* 5. Refatorar o exercício 04, utilizando a estrutura switch. */
package controle.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int contador = 0;

		System.out.print("Digite um número: ");
		int numero = scan.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contador++;
			}
		}

		switch (contador) {
		case 0:
			System.out.printf("%d é primo", numero);
			break;

		default:
			System.out.printf("%d não é primo", numero);
		}

		scan.close();
	}
}
