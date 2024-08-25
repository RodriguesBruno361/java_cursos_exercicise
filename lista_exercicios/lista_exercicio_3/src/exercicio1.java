import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;

		while (true) {
			System.out.println("Bem vindo ao posto Agnaripi!");
			System.out.println("Digite a opção desejada: ");
			System.out.println("1. Alcool");
			System.out.println("2. Gasolina");
			System.out.println("3. Diesel");
			System.out.println("4. Fim");
			System.out.println("***");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Você escolheu Alcool");
				break;
			case 2:
				System.out.println("Você escolheu Gasolina");
				break;
			case 3:
				System.out.println("Você escolheu Diesel");
				break;
			case 4:
				System.out.println("MUITO OBRIGADO");
				break;
			case 5:
				System.out.println("Código invalido!");
				break;
				}
			System.exit(0);
			sc.close();
		}	
	}
}
