/* 6. Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. 
 Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta */
package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o valor de A: ");
		int a = scan.nextInt();
		System.out.print("Digite o valor de B: ");
		int b = scan.nextInt();
		System.out.print("Digite o valor de C: ");
		int c = scan.nextInt();

		int delta = (b * b) - (4 * a * c);

		System.out.printf("\n%dx² + %dx + %d = 0", a, b, c);
		System.out.println("\ndelta = " + delta);
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		System.out.printf("\nx1 = %.2f", x1);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.printf("\nx2 = %.2f",x2);

		scan.close();
	}
}
