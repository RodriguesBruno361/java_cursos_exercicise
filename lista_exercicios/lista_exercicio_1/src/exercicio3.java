import java.util.Scanner;

public class exercicio3 {
	public static void main (String[] args) {
		
		int A, B, C, D, DIFERENCA;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextInt();
		
		System.out.println("Digite o valor de B: ");
		B = sc.nextInt();
		
		System.out.println("Digite o valor de C: ");
		C = sc.nextInt();
		
		System.out.println("Digite o valor de D: ");
		D = sc.nextInt();
		
		DIFERENCA = A * B - C * D;
		
		System.out.print("Produto: " + DIFERENCA);
		
		sc.close();
	}
}
