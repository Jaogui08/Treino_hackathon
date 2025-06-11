package hackathon_treino.random;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("Faça sua escolha (1 - Pedra, 2 - Papel, 3 - Tesoura): ");
		int escolha = scanner.nextInt();
		
		int escolhaMaquina = random.nextInt(1, 3);
		
		if ((escolha == 1 && escolhaMaquina == 3) || (escolha == 2 && escolhaMaquina == 1) || (escolha == 3 && escolhaMaquina == 2)) {
			System.out.println("\nParabéns você ganhou!");
		} else if (escolha < 1 || escolha > 3) {
			System.out.println("\nNúmeros inválidos, a máquina ganhou");
		} else {
			System.out.println("\nA máquina levou a melhor");
		}
		
		scanner.close();
	}

}
