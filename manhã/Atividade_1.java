package hackathon_treino.manhã;

import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a latitude do ponto geográfico em que você está: ");
		int latitude = scanner.nextInt();
		
		System.out.println((latitude >= 0) ? "\nVocê está no hemisfério norte" : "\nVocê está no hemisfério sul");

		scanner.close();

	}

}
