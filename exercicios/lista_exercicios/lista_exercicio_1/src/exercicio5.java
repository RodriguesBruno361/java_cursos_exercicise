import java.util.Scanner;
import java.util.Locale;
public class exercicio5 {
	
	public static void main (String[] args) {
		
		int cod_peca1, qtd_peca1, cod_peca2, qtd_peca2;
		Double val_unitario_peca1, val_unitario_peca2;		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o código da primeira peça: ");
		cod_peca1 = sc.nextInt();
		
		System.out.println("Informe a quantidade da primeira peça: ");
		qtd_peca1 = sc.nextInt();
		
		System.out.println("Informe o valor unitário da primeira peça: ");
		val_unitario_peca1 = sc.nextDouble();
		
		System.out.println("Informe o código da segunda peça: ");
		cod_peca2 = sc.nextInt();
		
		System.out.println("Informe a quantidade da segunda peça: ");
		qtd_peca2 = sc.nextInt();
		
		System.out.println("Informe o valor unitário da segunda peça: ");
		val_unitario_peca2 = sc.nextDouble();
		
		Double val_a_pagar = (val_unitario_peca1 * qtd_peca1) + (val_unitario_peca2 * qtd_peca2);
		
		System.out.println("Valor a ser pago para os códigos: " + cod_peca1 + cod_peca2);
		System.out.printf("Valor a ser pago: %.2f", val_a_pagar);
		
		sc.close();
	}
}
