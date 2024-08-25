import java.util.Scanner;
import java.util.Locale;

public class exercicio4 {
	
	public static void main (String[] args) {
		
		Double num_func, num_horas_trabalhadas, hora_trabalhada, salario_final;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número do funcionário: ");
		num_func = sc.nextDouble();
		
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		num_horas_trabalhadas = sc.nextDouble();
		
		System.out.println("Quanto ganha por hora trabalhada: ");
		hora_trabalhada = sc.nextDouble();
		
		salario_final = num_horas_trabalhadas * hora_trabalhada;
		
		System.out.println("O funcionário de número: " + num_func);
		System.out.printf("Irá receber o salário de: %.2f",  salario_final);
		
		sc.close();
	}
}
