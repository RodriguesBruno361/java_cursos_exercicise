package entities;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoMedia {
	private double[] numeros;

	public AbaixoMedia(int n) {
		this.numeros = new double[n];
	}

	public double[] getNumeros() {
		return numeros;
	}

	public void capturarDados() {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double soma = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextDouble();
		}

		for (int i = 0; i < numeros.length; i++) {
			soma = soma + numeros[i];
		}

		double media = soma / numeros.length;

		System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
		System.out.println("Elementos abaixo da média: ");

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < media) {
				System.out.printf("%.1f\n", numeros[i]);
			}
		}
		sc.close();
	}
}
