import java.util.Scanner;

public class exercicio3 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int A,B;
		
		System.out.println("Informe o primeiro número: ");
		A = sc.nextInt();
		
		System.out.println("Informe o primeiro número: ");
		B = sc.nextInt();
		
		if (A % 2 == 0 || B % 2 == 0) {
			System.out.println("São multiplos");
		}
		else {
			System.out.println("Não são multiplos");
		}
		
		sc.close();
	}
}
