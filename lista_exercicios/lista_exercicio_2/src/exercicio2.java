import java.util.Scanner;

public class exercicio2 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int n;
		
		System.out.println("Informe um número: ");
		n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}
}
