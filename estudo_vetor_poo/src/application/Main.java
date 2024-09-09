package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Product;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Informe a quantidade de produtos: ");
		int n = sc.nextInt();

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Informe o nome do produto: ");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.println("Informe o preço do produto: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("Média de preços: %.2f%n" + avg);
		sc.close();
	}
}
