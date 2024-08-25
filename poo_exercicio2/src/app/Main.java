package app;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Main {
	public static void main (String[] srgs) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee funcionario = new Employee();
		
		System.out.print("Nome: ");
		funcionario.name = sc.nextLine();
		
		System.out.print("Salário bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("Funcionário: " + funcionario.name + ", $" + funcionario.salarioLiquido());
		
		System.out.print("Qual o percentual de acréscimo para o salário? ");
		double porcentagem = sc.nextDouble();
		funcionario.salarioAcrescido(porcentagem);
		
		System.out.println("Salário atualizado: " + funcionario);
		sc.close();
	}
}
