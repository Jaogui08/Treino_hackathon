package hackathon_treino.tarde;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o nível do seu pokémon: ");
		int pokeLevel = scanner.nextInt();
		
		System.out.println((pokeLevel >= 16) ? "\nSeu pokémon pode evoluir!" : "\nSeu pokémon ainda precisa de mais níveis para evoluir");

		scanner.close();
	}

}
