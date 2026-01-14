/* 7. Criar um programa que enquanto estiver recebendo números positivos,
 * imprime no console a soma dos números inseridos, caso receba um número
 * negativo, encerre o programa. Tente utilizar a estrutura do while.
 */
package controle.exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int somadorNumeros = 0;
		int numero = 0;

		while (numero >= 0) {
			System.out.print("Digite um número inteiro (ou negativo para sair): ");
			numero = scan.nextInt();
			if (numero >= 0) {
				somadorNumeros += numero;
				System.out.printf("\nSoma: %d\n", somadorNumeros);
			}
		}

		scan.close();
	}
}
