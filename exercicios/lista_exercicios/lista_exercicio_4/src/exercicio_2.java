import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int in = 0;
		int out = 0;

		System.out.println("Por favor informe um número: ");
		int n = sc.nextInt();
	
		for (int i = 0; i < n; i++) {
			if (n >= 10 && n <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}
}