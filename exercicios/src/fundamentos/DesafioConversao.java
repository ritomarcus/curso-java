package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Primeiro salário: ");
		String valor1 = scan.next().replace(",", ".");

		System.out.print("Segundo salário: ");
		String valor2 = scan.next().replace(",", ".");

		System.out.print("Teceiro salário: ");
		String valor3 = scan.next().replace(",", ".");

		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);

		double media = ((salario1 + salario2 + salario3) / 3);
		System.out.println("A média dos salários é " + media);

		scan.close();
	}
}
