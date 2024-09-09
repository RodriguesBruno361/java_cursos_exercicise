package app;

import java.util.Scanner;

import entities.SomaVetores;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos valores vai ter cada vetor?");
		int n = sc.nextInt();

		SomaVetores somaVetores = new SomaVetores(n);

		somaVetores.capturarValores();
		somaVetores.somarVetores();

		sc.close();
	}
}
