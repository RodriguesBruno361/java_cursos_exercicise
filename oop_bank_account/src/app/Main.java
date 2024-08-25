package app;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class Main {

	public static void main(String[] args) {

		Conta conta;

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Por favor informe o nome do titular: ");
		String titular = sc.nextLine();
		System.out.print("Por favor informe o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Você irá realizar um depósito inicial (s/n)?");
		char resposta = sc.next().charAt(0);

		if (resposta == 's') {
			System.out.println("Qual será o valor do depósito?");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		}

		else {
			conta = new Conta(numero, titular);
		}

		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);

		System.out.println();
		System.out.println("Entre com um valor de depósito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Atualizando conta");
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(".");
		}		
		System.out.println();
		System.out.println("Conta atualizada!");
		System.out.println("Dados da conta: ");
		System.out.println(conta);

		System.out.println();
		System.out.println("Qual o valor que deseja retirar? ");
		double valorRetirada = sc.nextDouble();
		conta.retirada(valorRetirada);
		System.out.println("Atualizando conta");
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(".");
		}
		System.out.println("Conta atualizada!");
		System.out.println("Dados da conta: ");
		System.out.println(conta);

		sc.close();
	}

}
