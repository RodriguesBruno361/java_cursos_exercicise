import java.util.Scanner;

public class exercicio2 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int n1;
		
		System.out.println("Informe um número: ");
		n1 = sc.nextInt();
		
		if (n1 <= 1) {
			
			System.out.println("Não é número primo!");
		}
		else if (Math.sqrt(n1) % 2 == 0) {
			
			System.out.println("Número primo!");
		}		
		sc.close();			
	}
}
