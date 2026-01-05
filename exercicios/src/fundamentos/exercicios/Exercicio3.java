// 3. Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double peso;
		double altura;
		
		System.out.print("Peso = ");
		peso = scan.nextDouble();
		System.out.print("Altura = ");
		altura = scan.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println(imc);
		
		scan.close();
		
	}
}
