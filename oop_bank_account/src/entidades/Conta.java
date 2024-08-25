package entidades;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;

	// Construtor
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	// Sobrecarga
	public Conta(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		deposito(depositoInicial);
	}

	// Encapsulamento com get and setters
	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double montante) {
		saldo += montante;
	}

	public void retirada(double montante) {
		saldo -= montante + 5.00;
	}

	public String toString() {
		return "Conta " + numero + ", Titular " + titular + ", Saldo: R$ " + String.format("%.2f", saldo);
	}
}
