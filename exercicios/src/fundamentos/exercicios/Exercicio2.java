// 2. Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a temperatura: ");

		double celsius = scan.nextDouble();

		double fahrenheit = (celsius * 1.8) + 32;

		System.out.printf("\nTemperatura em graus Fahrenheit: %.2f°", fahrenheit);

		scan.close();
	}
}
