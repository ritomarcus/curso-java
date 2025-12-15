package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		double raio = 3.4;
		final double Pi = 3.14159; // Nome de constantes com letra maiúsculas
		
		double area = Pi * raio * raio;
		
		System.out.println(area);
		
		raio = 10;
		area = Pi * raio * raio;
		System.out.println("Área = " + area + "m2.");
	}
}
