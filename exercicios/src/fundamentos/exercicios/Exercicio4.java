package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		double valor = scan.nextDouble();
		
		System.out.printf("O quadrado de %.2f = %.2f", valor, Math.pow(valor, 2));
		System.out.printf("\nO cubo de %.2f = %.2f", valor, Math.pow(valor, 3));
	
		scan.close();
	}
}
