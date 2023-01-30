package controleBancario;

public class ContaCorrente extends Conta {
	
	private double limiteEspecial;
	
	public ContaCorrente(double vSaldo, double vLimiteEspecial) {
		super(vSaldo);
		this.limiteEspecial = vLimiteEspecial;
	}
	
	public ContaCorrente() {
		
	}
	
	public void sacar(double valor) throws ValorInvalidoException, SaldoInsuficienteException {
		if(valor<0) {
			throw new ValorInvalidoException();
		}else if(valor>(this.getSaldo()+this.limiteEspecial)) {
			throw new SaldoInsuficienteException();
		}else {
			this.setSaldo(this.getSaldo() - valor);
		}
	}
	
	protected double getLimiteEspecial() {
		return limiteEspecial;
	}

	protected void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public String toString() {
		return "Saldo R$ " + this.getSaldo() +
				"\nLimite especial R$ " + this.limiteEspecial;
	}
		
}
