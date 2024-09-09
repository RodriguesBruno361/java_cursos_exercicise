package entities;

import java.util.Scanner;

public class SomaVetores {
	private int[] vetorA;
	private int[] vetorB;
	private int[] vetorC;
	
	//Construtor que diz o tamanho do array simbolizado por n no parametro
	public SomaVetores(int n) {
		this.vetorA = new int[n];
		this.vetorB = new int[n];
		this.vetorC = new int[n];
	}

	public int[] getVetorA() {
		return vetorA;
	}

	public int[] getVetorB() {
		return vetorB;
	}

	public int[] getVetorC() {
		return vetorC;
	}

	public void capturarValores() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe os valores do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}

		System.out.print("Informe os valores do vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = sc.nextInt();
		}
		sc.close();
	}

	public void somarVetores() {
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		System.out.println("Vetor resultante: ");

		for (int i = 0; i < vetorC.length; i++) {
			System.out.printf("%d\n", vetorC[i]);
		}
	}
}
