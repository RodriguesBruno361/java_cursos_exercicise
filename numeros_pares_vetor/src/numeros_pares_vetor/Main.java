package numeros_pares_vetor;

import java.util.Scanner;
import entities.NumerosPares;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você irá digitar? ");
		int n = sc.nextInt();

		int[] numeros = new int[n];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextInt();
		}

		NumerosPares numerosPares = new NumerosPares(numeros);

		int[] pares = numerosPares.capturarPares();
		System.out.println("Números pares: ");
		for (int par : pares) {
			System.out.print(par + " ");
		}
		System.out.println();

		int quantidadePares = numerosPares.contarPares();
		System.out.println("Quantidade de números pares: " + quantidadePares);

		sc.close();
	}
}
