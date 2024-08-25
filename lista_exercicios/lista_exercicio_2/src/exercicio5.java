import java.util.Scanner;

public class exercicio5 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int codigo, quantidade;
		double total;
		
		System.out.println("Informe o código do item: ");
		codigo = sc.nextInt();
		
		System.out.println("Informe a quantidade do item: ");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			total = quantidade * 4.00;
		}
		
		else if (codigo == 2) {
			total = quantidade * 4.50;
		}
		
		else if (codigo == 3) {
			total = quantidade * 5.00;
		}
		
		else if (codigo == 4) {
			total = quantidade * 2.00;
		}
		
		else {
			total = quantidade * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}
}
