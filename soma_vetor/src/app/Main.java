package app;

import java.util.Scanner;

import entities.NumeroVetor;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		NumeroVetor numeroVetor = new NumeroVetor(n);
		numeroVetor.lerNumeros();
		
		numeroVetor.imprimirNumeros();
		
		System.out.printf("SOMA = %.2f%n", numeroVetor.getSoma());
		System.out.printf("MEDIA = %.2f%n", numeroVetor.getMedia());
		sc.close();
	}

}
