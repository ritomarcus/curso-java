/* 3. Criar um programa que receba duas notas parciais, calcular a média
 * final. Se a nota do aluno for maior ou igual a 7.0 imprime no console
 * "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console
 * "Recuperação", caso contrário imprime no console "Reprovado". */
package controle.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a nota 1: ");
		double nota1 = scan.nextDouble();

		System.out.print("Digite a nota 2: ");
		double nota2 = scan.nextDouble();

		double mediaFinal = (nota1 + nota2) / 2;

		if (mediaFinal >= 7.0) {
			System.out.println("Média: " + mediaFinal + " Aprovado");
		} else if (mediaFinal >= 4.0) {
			System.out.println("Média: " + mediaFinal + " Recuperação");
		} else {
			System.out.println("Média: " + mediaFinal + " Reprovado");
		}

		scan.close();
	}
}
