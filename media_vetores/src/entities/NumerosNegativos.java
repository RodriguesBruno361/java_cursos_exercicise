package entities;

import java.util.Scanner;

public class NumerosNegativos {
	private int[] numeros;

	public NumerosNegativos(int n) {
		this.numeros = new int[n];
	}

	public int[] getNumeros() {
		return numeros;
	}

	public void capturarNegativos() {
		int somaPares = 0;
		int nPares = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número: ");
			numeros[i] = sc.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				somaPares = somaPares + numeros[i];
				nPares++;
			}
		}
		if (nPares == 0) {
			System.out.println("NENHUM NÚMERO PAR FOI ENCONTRADO");
		} else {
			double mediaPares = (double) somaPares / nPares;

			System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares);
		}
		sc.close();
	}
}
