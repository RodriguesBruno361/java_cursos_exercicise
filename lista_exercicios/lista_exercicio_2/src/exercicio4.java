import java.util.Scanner;

public class exercicio4 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora_inicial, hora_final, duracao;
		
		System.out.println("Informe a hora que o jogo começou: ");
		hora_inicial = sc.nextInt();
		
		System.out.println("Informe a hora que o jogo terminou: ");
		hora_final = sc.nextInt();
		
		if (hora_inicial < hora_final) {
			duracao = hora_final - hora_inicial;
		}
		else {
			duracao = 24 - hora_inicial + hora_final;
		}
		System.out.println("O jogo durou " + duracao + " horas");
		
		sc.close();
	}
}
