package app;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Main {
	public static void main(String[] args) {
				
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a cotação atual do dolar: ");
		double dolar = sc.nextDouble();
		
		System.out.println("Quanto você irá comprar de dolar? ");
		double cotation = sc.nextDouble();
		
		double result = CurrencyConverter.converter(dolar, cotation);
		
		System.out.println("Quanto você irá pagar em reais: " + result);
		
		sc.close();
	}
}
