package hackathon_treino.tarde;

import java.util.Scanner;

public class Atividade_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a idade do seu treinador: ");
		int idadeTreinador = scanner.nextInt();
		
		System.out.print("Informe o nível do seu pokémon: ");
		int pokeLevel = scanner.nextInt();
		
		if (idadeTreinador >= 12 && pokeLevel >= 20) {
			System.out.println("\nVocê está qualificado para o torneio");
		} else {
			System.out.println("\nVocê ainda precisa treinar mais para ir para o torneio");
		}

		scanner.close();
	}

}
