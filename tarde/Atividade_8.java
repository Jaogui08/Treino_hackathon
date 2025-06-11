package hackathon_treino.tarde;

import java.util.Scanner;

public class Atividade_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um número de 1 a 3: ");
		int numero = scanner.nextInt();
		
		switch (numero) {
		
		case 1:
			System.out.println("\nFogo");
			break;
		case 2:
			System.out.println("\nÁgua");
			break;
		case 3:
			System.out.println("\nPlanta");
			break;
		default:
			System.out.println("\nTipo desconhecido");
			break;
		}
		
		scanner.close();
	}

}
