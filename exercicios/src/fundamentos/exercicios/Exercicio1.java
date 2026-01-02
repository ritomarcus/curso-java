// 1. Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a temperatura: ");
		
		double fahrenheit = scan.nextDouble();
		
		double celsius = (fahrenheit - 32) / 1.8;
		
		System.out.printf("\nTemperatura em graus celsius: %.2f°", celsius);
		
		scan.close();
	}
}
