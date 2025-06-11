package hackathon_treino.tarde;

import java.util.Scanner;

public class Atividade_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escolha um número entre 1 a 4: ");
		int numeroAtaque = scanner.nextInt();
		
		switch (numeroAtaque) {
		
		case 1:
			System.out.println("\nInvestida");
			break;
		case 2:
			System.out.println("\nRajada de Fumaça");
			break;
		case 3:
			System.out.println("\nChoque do Trovão");
			break;
		case 4:
			System.out.println("\nHidro Bomba");
			break;
		default:
			System.out.println("\nAtaque desconheido");
			break;
		}
		
		scanner.close();
	}

}
