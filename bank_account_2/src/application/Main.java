package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		Account conta;
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Informe o nome do titular: ");
		String titular = sc.nextLine();
		
		System.out.print("Informe o número da conta: ");
		int numero = sc.nextInt();
		
		System.out.print("Você irá fazer o primeiro depósito (s/n)? ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			System.out.print("Informe o valor do primeiro depósito: ");
			double depositoInicial = sc.nextDouble();
			conta = new Account(numero, titular, depositoInicial);
		} else {
			conta = new Account(numero, titular);
		}
		
		System.out.println("--------");
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		System.out.println("--------");
		
		System.out.print("Qual o valor do novo depósito? ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Atualizando dados da conta...");
		System.out.println("Dados atualizados!");
		System.out.println(conta);
		System.out.println("--------");
		
		System.out.print("Qual o valor da retirada? ");
		double valorRetirada = sc.nextDouble();
		conta.retirada(valorRetirada);
		System.out.println("Atualizando dados da conta...");
		System.out.println("Dados atualizados!");
		System.out.println(conta);
		System.out.println("--------");
		
		sc.close();
	}
}
