import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y;

		System.out.println("Informe o valor de X: ");
		x = sc.nextInt();

		System.out.println("Informe o valor de Y: ");
		y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			}
			if (x < 0 && y > 0) {
				System.out.println("Segundo");
			}
			if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			} else {
				System.out.println("Quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
	}
}
