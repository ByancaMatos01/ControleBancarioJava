package controleBancario;

public class ValorInvalidoException extends Exception{
	@Override
	public String toString() {
		return "Valor inválido!";
	}
}
