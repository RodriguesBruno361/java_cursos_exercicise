package app;

import java.util.Locale;
import java.util.Scanner;

import entities.AbaixoMedia;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		AbaixoMedia abaixoMediaObj = new AbaixoMedia(n);
		
		abaixoMediaObj.capturarDados();
		sc.close();
	}

}
