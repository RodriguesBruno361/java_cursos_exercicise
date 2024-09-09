package app;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosPessoas;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();

		DadosPessoas[] dadosPessoasObj = new DadosPessoas[n];

		double menorAltura = Double.MAX_VALUE;
		double maiorAltura = Double.MIN_VALUE;
		double somaAlturasF = 0;
		int quantidadeMulheres = 0;
		int quantidadeHomens = 0;

		for (int i = 0; i < dadosPessoasObj.length; i++) {

			System.out.printf("Altura da %da pessoa: \n", i + 1);
			String alturaString = sc.nextLine().replace(",", ".");

			System.out.printf("Genêro da %da pessoa (M/F): \n", i + 1);
			String genero = sc.nextLine();

			double altura = Double.parseDouble(alturaString);

			// Atualizando a menor e maior altura
			if (altura < menorAltura) {
				menorAltura = altura;
			}
			if (altura > maiorAltura) {
				maiorAltura = altura;
			}

			// Atualizando contadores e soma de alturas das mulheres
			if (genero.equals("F")) {
				somaAlturasF += altura;
				quantidadeMulheres++;
			} else if (genero.equals("M")) {
				quantidadeHomens++;
			}

			dadosPessoasObj[i] = new DadosPessoas(altura, genero);
		}
		// Calculando a média de altura das mulheres
        double mediaAlturaF = quantidadeMulheres > 0 ? somaAlturasF / quantidadeMulheres : 0;

        // Exibindo os resultados
        System.out.printf("Menor altura: %.2f\n", menorAltura);
        System.out.printf("Maior altura: %.2f\n", maiorAltura);
        System.out.printf("Média de altura das mulheres: %.2f\n", mediaAlturaF);
        System.out.println("Número de homens: " + quantidadeHomens);
		sc.close();
	}
}
