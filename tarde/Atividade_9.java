package hackathon_treino.tarde;

import java.util.Scanner;

public class Atividade_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o nome de um pokémon: ");
		String pokeNome = scanner.next().toLowerCase();
		
		switch (pokeNome) {
		
		case "bulbassaur":
			System.out.println("\nA região de origem desse pokémon é Kanto");
			break;
		case "chimchar":
			System.out.println("\nA região de origem desse pokémon é Sinnoh");
			break;
		case "torchic":
			System.out.println("\nA região de origem desse pokémon é Hoenn");
			break;
		default:
			System.out.println("\nA região de origem desse pokémon é desconhecida");
			break;
		}
		
		scanner.close();
	}

}
