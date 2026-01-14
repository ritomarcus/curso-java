// 8. Crie um programa que recebe 10 valores e ao final imprima o maior número. 
package controle.exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int maiorValor = 0;
		int contador = 0;

		do {
			System.out.println("\nDigite um numero: ");
			int valor = scan.nextInt();

			if (valor > maiorValor) {
				maiorValor = valor;
			}

			contador++;
		} while (contador != 10);

		System.out.printf("O maior valor foi: " + maiorValor);

		scan.close();
	}
}
