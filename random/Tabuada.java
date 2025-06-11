package hackathon_treino.random;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o número que gostaria de saber a tabuada: ");
		int numero = scanner.nextInt();
		
		if (numero < 1) {
			System.out.println("\nNão existe tabuada de zero");
		} else {
			System.out.println("\nTabuada do " + numero + ": \n");
			for (int i=1; i<=10; i++) {
				System.out.println(numero + " x " + i + " = " + (numero * i));
			}
		}
		
		scanner.close();
	}

}
