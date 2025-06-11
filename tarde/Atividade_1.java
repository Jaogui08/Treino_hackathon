package hackathon_treino.tarde;

import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o nível do seu pokémon: ");
		int pokeLevel = scanner.nextInt();
		
		System.out.println((pokeLevel > 70) ? "\nSeu pokémon é de elite" : "\nSeu pokémon é comum");
		
		scanner.close();
	}

}
