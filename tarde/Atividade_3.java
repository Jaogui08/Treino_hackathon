package hackathon_treino.tarde;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o nome de um pokémon: ");
		String pokeNome = scanner.next();
		
		System.out.println((pokeNome.equalsIgnoreCase("Pikachu") ? "\nPokémon popular" : "\nOutro pokémon"));
		
		scanner.close();
	}

}
