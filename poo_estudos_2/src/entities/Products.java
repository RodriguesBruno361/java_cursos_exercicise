package entities;

public class Products {
	public String name;
	public double price;
	public int quantity;

	// Construtor
	public Products(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		// O argumento this indica que eu estou acessando o
		// atributo quantity ao invés do parametro
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	// Faz a sobreposição para formatar a saída da solução
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
