package hackathon_treino.random;

import java.util.Scanner;

public class Idade_veiculo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o ano de fabricação do seu veículo: ");
		int anoVeiculo = scanner.nextInt();
		
		if (anoVeiculo < 1990) {
			System.out.println("\nSeu veículo é muito antigo");
		} else if (anoVeiculo >= 1990 && anoVeiculo < 2010) {
			System.out.println("\nSeu veículo é antigo");
		} else if (anoVeiculo >= 2010 && anoVeiculo < 2020) {
			System.out.println("\nSeu veículo é moderno");
		} else {
			System.out.println("\nSeu veículo é novo");
		}
		
		scanner.close();
	}

}
