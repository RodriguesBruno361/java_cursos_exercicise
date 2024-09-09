import java.util.Scanner;
import java.util.Locale;

public class exercicio_4 {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe um número referência: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Informe o primeiro número: ");
			double a = sc.nextDouble();
			
			System.out.println("Informe o segundo número: ");
			double b = sc.nextDouble();
			
			if (b == 0) {
				System.out.println("Divisão impossível!");
			} else {
				double div = (double) a / b;
				System.out.printf("%.1f%n", div);
			}
		}
		sc.close();
	}
}
