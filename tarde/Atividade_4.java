package hackathon_treino.tarde;

import java.util.Scanner;

public class Atividade_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Seu pokémon é de nível lendário? (sim/não): ");
		String pokeRarity = scanner.next();
		
		System.out.println((pokeRarity.equalsIgnoreCase("sim")) ? "\nExtremamente raro" : "\nComum");
		
		scanner.close();
	}

}
