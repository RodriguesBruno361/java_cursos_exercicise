import java.util.Scanner;
import java.util.Locale;

public class exercicio6 {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("Informe o primeiro número: ");
		A = sc.nextDouble();
		
		System.out.println("Informe o segundo número: ");
		B = sc.nextDouble();
		
		System.out.println("Informe o terceiro número: ");
		C = sc.nextDouble();
		
		triangulo = A * C /2.0;
		circulo = Math.PI * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = Math.pow(B, 2);
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
	}
}
