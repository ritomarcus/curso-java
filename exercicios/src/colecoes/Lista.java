package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();

		Usuario u1 = new Usuario("José");

		lista.add(u1);
		lista.add(new Usuario("André"));
		lista.add(new Usuario("Afonso"));
		lista.add(new Usuario("Éder"));
		lista.add(new Usuario("Miguel"));

		System.out.println(lista.get(3)); // acessar pelo índice

		System.out.println(">>>>> " + lista.remove(1));
		lista.remove(new Usuario("Miguel"));

		System.out.println("Tem ? " + lista.contains(new Usuario("Afonso")));
		System.out.println("Tem ? " + lista.contains(u1));

		for (Usuario u : lista) {
			System.out.println(u.nome);
		}
	}
}
