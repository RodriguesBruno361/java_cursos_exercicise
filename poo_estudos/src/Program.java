import java.util.Scanner;
import java.util.Locale;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Variavel do objeto Triangle
		Triangle x, y;
		
		//Instanciando as variaveis ao objeto
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measuares of triangle X: ");
		//Atribuindo a variavel ao atributo do objeto
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measuares of triangle X: ");
		//Atribuindo a variavel ao atributo do objeto
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//Pega o metodo de um objeto
		double areaX = x.area();
		double areaY = y.area();	
			
		System.out.printf("Triangle X area:  $.4f%n", areaX);
		System.out.printf("Triangle X area:  $.4f%n", areaY);
		
		sc.close();
	}

}
