package app;

import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class Main {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student estudante = new Student();
		
		System.out.print("Nome do aluno: ");
		estudante.name = sc.nextLine();
		
		System.out.print("NOTA 1: ");
		estudante.grade1 = sc.nextDouble();
		
		System.out.print("NOTA 2: ");
		estudante.grade2 = sc.nextDouble();
		
		System.out.print("NOTA 3: ");
		estudante.grade3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL: %.2f%n", estudante.finalGrade());
		
		if (estudante.finalGrade() < 60.0) {
			System.out.println("REPROVADO");
			System.out.printf("Faltavam %.2f PONTOS%n", estudante.missingNotes());
		} 
		else {
			System.out.println("APROVADO");
		}
		sc.close();
	}
}
