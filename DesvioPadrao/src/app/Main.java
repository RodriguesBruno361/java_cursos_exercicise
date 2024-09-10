package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			ArrayList<Integer> numeros = new ArrayList<>();
			int numero;

			// Leitura dos números até que um número negativo seja digitado
			System.out.println("Digite números inteiros (digite um número negativo para encerrar): ");
			while (true) {
				numero = scanner.nextInt();
				if (numero < 0)
					break;
				numeros.add(numero);
			}

			if (numeros.size() == 0) {
				System.out.println("Nenhum número positivo foi informado.");
			} else {
				double media = calcularMedia(numeros);
				double desvioPadrao = calcularDesvioPadrao(numeros, media);

				System.out.println("Soma: " + calcularSoma(numeros));
				System.out.println("Média: " + media);
				System.out.println("Desvio Padrão: " + desvioPadrao);
			}
		}
	}

	// Método para calcular a soma dos números
	public static int calcularSoma(ArrayList<Integer> numeros) {
		int soma = 0;
		for (int num : numeros) {
			soma += num;
		}
		return soma;
	}

	// Método para calcular a média
	public static double calcularMedia(ArrayList<Integer> numeros) {
		return (double) calcularSoma(numeros) / numeros.size();
	}

	// Método para calcular o desvio padrão
	public static double calcularDesvioPadrao(ArrayList<Integer> numeros, double media) {
		double somaDesviosQuadrados = 0;
		for (int num : numeros) {
			somaDesviosQuadrados += Math.pow(num - media, 2);
		}
		return Math.sqrt(somaDesviosQuadrados / numeros.size());
	}
}
