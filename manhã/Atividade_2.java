package hackathon_treino.manhã;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o número do mês em que estamos: ");
		int mes = scanner.nextInt();
		
		switch (mes) {
		
		case 1, 2, 12:
			System.out.println("\nEstamos no verão");
			break;
		case 3, 4, 5:
			System.out.println("\nEstamos no outono");
			break;
		case 6, 7, 8:
			System.out.println("\nEstamos no inverno");
			break;
		case 9, 10, 11:
			System.out.println("\nEstamos na primavera");
			break;
		default:
			System.out.println("\nMês inválido");
		}
	
		scanner.close();

	}

}
