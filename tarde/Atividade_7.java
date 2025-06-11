package hackathon_treino.tarde;

import java.util.Scanner;

public class Atividade_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o nível do 1° pokémon: ");
		int pokeLevel1 = scanner.nextInt();
		
		System.out.print("Informe o nível do 2° pokémon: ");
		int pokeLevel2 = scanner.nextInt();
		
		if (pokeLevel1 > pokeLevel2) {
			System.out.println("\nO primeiro pokémon é mais forte");
		} else if (pokeLevel1 < pokeLevel2) {
			System.out.println("\nO segundo pokémon é mais forte");
		} else {
			System.out.println("\nOs dois pokémons estão no mesmo nível de força");
		}
		
		scanner.close();
	}

}
