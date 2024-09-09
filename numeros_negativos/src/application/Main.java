package application;

import java.util.Scanner;

import entities.Negativos;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você irá digitar? ");
		int numeros = sc.nextInt();

		Negativos[] vect = new Negativos[numeros];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um número: ");
			int n = sc.nextInt();
			vect[i] = new Negativos(n);
		}
		System.out.println("Numeros negativos: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getNumeros() < 0) {
				System.out.println(vect[i].getNumeros());
			}
		}
		sc.close();
	}
}
