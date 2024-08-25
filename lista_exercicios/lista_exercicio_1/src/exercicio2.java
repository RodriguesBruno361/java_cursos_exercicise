import java.util.Scanner;

public class exercicio2 {
	
	public static void main (String[] args) {
		
		double area, raio, pi = 3.14159;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor do raio: ");
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("O Valor do circulo: %.4f%n", area);
		
		sc.close();		
	}
}
