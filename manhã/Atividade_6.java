package hackathon_treino.manhã;

import java.util.Scanner;

public class Atividade_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int numero = scanner.nextInt();
		
		switch (numero) {
		
		case 1:
			System.out.println("\nBrasil");
			break;
		case 2:
			System.out.println("\nArgentina");
			break;
		case 3:
			System.out.println("\nChile");
			break;
		case 4:
			System.out.println("\nPeru");
			break;
		case 5:
			System.out.println("\nUruguai");
			break;
		default:
			System.out.println("\nNúmero inválido");
		}
		
		scanner.close();

	}

}
