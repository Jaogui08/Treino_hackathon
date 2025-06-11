package hackathon_treino.tarde;

import java.util.Scanner;

public class Atividade_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o nível do seu treinador: ");
		int treinadorLevel = scanner.nextInt();
		
		if (treinadorLevel < 10) {
			System.out.println("\nTreinador iniciante");
		} else if (treinadorLevel >= 10 && treinadorLevel < 30) {
			System.out.println("\nTreinador intermediário");
		} else {
			System.out.println("\nTreinador experiente");
		}
		
		scanner.close();
	}

}
