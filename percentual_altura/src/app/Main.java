package app;

import java.util.Locale;
import java.util.Scanner;

import entities.AlturasNome;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();

		AlturasNome[] alturasNome = new AlturasNome[n];

		for (int i = 0; i < alturasNome.length; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();

			sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();

			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			alturasNome[i] = new AlturasNome(nome, idade, altura);
		}

		int menores = 0;
		double alturaTotal = 0;

		for (int i = 0; i < alturasNome.length; i++) {
			if (alturasNome[i].getIdade() < 16) {
				menores++;
			}
			alturaTotal += alturasNome[i].getAltura();
		}

		double alturaMedia = alturaTotal / n;
		double percentualMenores = (double) menores / n * 100;

		System.out.printf("\nAltura média: %.2f\n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

		for (int i = 0; i < alturasNome.length; i++) {
			if (alturasNome[i].getIdade() < 16) {
				System.out.println(alturasNome[i].getNome());
			}
		}
		sc.close();
	}
}
