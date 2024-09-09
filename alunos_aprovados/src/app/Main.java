package app;

import java.util.Locale;
import java.util.Scanner;

import entities.AlunosAprovados;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();

		AlunosAprovados[] alunosAprovadosObj = new AlunosAprovados[n];

		for (int i = 0; i < alunosAprovadosObj.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %d aluno: \n", i + 1);
			sc.nextLine();
			String nomeAluno = sc.nextLine();

			// Ler notas como string e substituir vírgula por ponto se necessário
			String nota1AlunoStr = sc.next().replace(",", ".");
			String nota2AlunoStr = sc.next().replace(",", ".");

			double nota1Aluno = Double.parseDouble(nota1AlunoStr);
			double nota2Aluno = Double.parseDouble(nota2AlunoStr);

			alunosAprovadosObj[i] = new AlunosAprovados(nomeAluno, nota1Aluno, nota2Aluno);
		}

		System.out.println("Alunos aprovados: ");

		for (int i = 0; i < alunosAprovadosObj.length; i++) {
			double media = (alunosAprovadosObj[i].getNota1Aluno() + alunosAprovadosObj[i].getNota2Aluno()) / 2;

			if (media >= 6.0) {
				System.out.printf("%s\n", alunosAprovadosObj[i].getNomeAluno());
			}
		}		
		sc.close();
	}
}
