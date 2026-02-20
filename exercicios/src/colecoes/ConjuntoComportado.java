package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

//		Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Matheus");
		listaAprovados.add("Zé");
		listaAprovados.add("Tião");

		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}

		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(200);
		nums.add(893);
		nums.add(72);

		for (int n : nums) {
			System.out.println(n);
		}
	}
}
