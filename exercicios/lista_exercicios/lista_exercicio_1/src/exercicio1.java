import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		int A, B;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		A = sc.nextInt();
		
		System.out.print("Digite o segundo número: ");
		B = sc.nextInt();
		
		int soma = A + B;
		
		System.out.println("O resultado da soma é: " + soma);
		
		sc.close();		
	}

}
