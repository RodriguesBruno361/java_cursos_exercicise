package app;

import java.util.Scanner;

import entities.MaisVelho;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		MaisVelho[] maisVelhoObj = new MaisVelho[n];
		
		for (int i = 0; i < maisVelhoObj.length; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nomePessoa = sc.nextLine();
			
			System.out.print("Idade: ");
			int idadePessoa = sc.nextInt();
			
			maisVelhoObj[i] = new MaisVelho(nomePessoa, idadePessoa);
		}
		
		int maiorIdade = maisVelhoObj[0].getIdadePessoa();
		String nomeMaisVelho = maisVelhoObj[0].getNomePessoa();
		
		for (int i = 1; i < maisVelhoObj.length; i++) {
			if (maisVelhoObj[i].getIdadePessoa() > maiorIdade) {
				maiorIdade = maisVelhoObj[i].getIdadePessoa();
				nomeMaisVelho = maisVelhoObj[i].getNomePessoa();
			}
		}
		
		System.out.printf("Pessoa mais velha: %s\n", nomeMaisVelho);
		sc.close();
	}
}
