package app;

import java.util.Scanner;

import entities.Aluguel;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluguel[] aluguelObj = new Aluguel[10];

		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Hospede #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("E- mail: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int numeroQuarto = sc.nextInt();
			aluguelObj[numeroQuarto] = new Aluguel(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < 10; i++) {
			if (aluguelObj[i] != null) {
				System.out.println(i + ": " + aluguelObj[i]);
			}
		}
		sc.close();
	}
}
