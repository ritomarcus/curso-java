package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Base: ");
		double base = scan.nextDouble();
		System.out.print("Altura: ");
		double altura = scan.nextDouble();

		double area = (base * altura) / 2;
		
		System.out.printf("A área do triângulo é %.2f", area);
		
		scan.close();
	}
}
