package entities;

import java.util.Scanner;

public class NumeroVetor {
	private double[] numeros;
	private double soma;
	private double media;

	public NumeroVetor(int n) {
		numeros = new double[n];
	}

	public double getSoma() {
		return soma;
	}

	public double getMedia() {
		return media;
	}

	public void lerNumeros() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextDouble();
		}
		calcularSomaMedia();
		sc.close();
	}

	public void imprimirNumeros() {
		System.out.println("VALORES: ");
		for (double numero : numeros) {
			System.out.printf("%.1f ", numero);
		}
		System.out.println();
	}

	private void calcularSomaMedia() {
		soma = 0.0;
		for (double numero : numeros) {
			soma += numero;
		}
		media = soma / numeros.length;
	}
}
