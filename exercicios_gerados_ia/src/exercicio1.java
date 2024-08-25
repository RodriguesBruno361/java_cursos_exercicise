import java.util.Scanner;

public class exercicio1 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, p1, p2, p3;
		
		System.out.println("Informe a primeira nota: ");
		n1 = sc.nextInt();
		
		System.out.println("Informe a segunda nota: ");
		n2 = sc.nextInt();
		
		System.out.println("Informe a terceira nota: ");
		n3 = sc.nextInt();
		
		System.out.println("Informe o peso da primeira nota: ");
		p1 = sc.nextInt();
		
		System.out.println("Informe o peso da segunda nota: ");
		p2 = sc.nextInt();
				
		System.out.println("Informe o peso da terceira nota: ");
		p3 = sc.nextInt();
		
		double media_ponderada = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3);
				
		System.out.println("Média ponderada: " + media_ponderada);
		
		sc.close();
	}
}
