package hackathon_treino.manhã;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o nome do seu continente: ");
		String continente = scanner.nextLine();

		if (continente.equalsIgnoreCase("America do Norte") || continente.equalsIgnoreCase("America Central") || continente.equalsIgnoreCase("America do Sul")) {
			System.out.println("\nÉ um continente americano");
		} else {
			System.out.println("\nNão é americano");
		}

			scanner.close();

	}

}
