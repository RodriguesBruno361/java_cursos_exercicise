import java.util.Locale;
import java.util.Scanner;

public class exercicio_3 {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Por favor informe o número de testes: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Informe o primeiro número: ");
			double a = sc.nextDouble();
			
			System.out.println("Informe o segundo número: ");
			double b = sc.nextDouble();
			
			System.out.println("Informe o terceiro número: ");
			double c = sc.nextDouble();
			
			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
			
			System.out.printf("%.1f%n", media);
		}
		sc.close();
	}
}
