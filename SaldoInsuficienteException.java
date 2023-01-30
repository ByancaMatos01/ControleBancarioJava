package controleBancario;

public class SaldoInsuficienteException extends Exception {
	public String toString() {
		return "Saldo insuficiente!";
	}
}
