package hackathon_treino.manhã;

import java.util.Scanner;

public class Atividade_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o seu fuso horário em relação ao UTC: ");
		int fusoHorario = scanner.nextInt();
		
		if (fusoHorario > 0) {
			System.out.println("\nFuso horário adiantado em relação ao UTC");
		} else if (fusoHorario < 0) {
			System.out.println("\nFuso horário atrasado em relação ao UTC");
		} else {
			System.out.println("\nHorário UTC 0");
		}
		
		scanner.close();

	}

}
