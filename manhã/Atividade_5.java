package hackathon_treino.manhã;

import java.util.Scanner;

public class Atividade_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o nome do seu país: ");
		String pais = scanner.next().toLowerCase();
		
		switch (pais) {
		
		case "brasil", "argentina", "peru":
			System.out.println("\nAmérica do Sul");
			break;
		case "frança", "alemanha":
			System.out.println("\nEuropa");
			break;
		case "china", "japao":
			System.out.println("\nÁsia");
			break;
		case "egito", "nigéria":
			System.out.println("\nÁfrica");
			break;
		default:
			System.out.println("\nPaís/continente não cadastrado");
			break;
		}
		
		scanner.close();

	}

}
