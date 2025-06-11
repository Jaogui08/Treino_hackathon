package hackathon_treino.random;

import java.util.Scanner;

public class Calculo_frete {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o peso da sua carga (kg): ");
		double peso = scanner.nextDouble();

		System.out.print("Informe a distância da fábrica até sua casa (km): ");
		double distancia = scanner.nextDouble();

		System.out.print("Gostaria de entrega rápida? (sim/não): ");
		String entrega = scanner.next().toLowerCase();

		double valorPeso = 0;
		double valorDistancia = 0;
		
		if (peso <= 1) {
			valorPeso = valorPeso + 5;
		} else if (peso > 1 && peso <= 5) {
			valorPeso = valorPeso + 10;
		} else if (peso > 5 && peso <= 20) {
			valorPeso = valorPeso + 20;
		} else {
			valorPeso = valorPeso + 50;
		}
		
		if (distancia > 101 && distancia <= 500) {
			valorDistancia = valorDistancia + 5;
		} else if (distancia > 501 && distancia <= 1000) {
			valorDistancia = valorDistancia + 10;
		} else if (distancia > 1000) {
			valorDistancia = valorDistancia + 20;
		}
		
		System.out.println("\nTaxas que seu produto recebeu:\n");
		System.out.println("Peso = " + valorPeso + " reais");
		System.out.println("Distância = " + valorDistancia + " reais");
		
		double somaFrete = valorPeso + valorDistancia;
		
		if (entrega.equals("sim")) {
			somaFrete = somaFrete * 1.5;
			System.out.println("\nCom a entrega rápida + 50% de taxa");
			System.out.println("Valor total da taxa = " + somaFrete + " reais");
		} else {
			System.out.println("\nValor total da taxa = " + somaFrete + " reais");
		}
		
		scanner.close();
	}

}
