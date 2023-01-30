package controleBancario;

public class ContaPoupanca extends Conta{
	private double reajusteMensal;
	
	public ContaPoupanca(double vSaldo, double vReajusteMensal) {
		super(vSaldo);
		this.reajusteMensal = vReajusteMensal;
	}
	
	public ContaPoupanca() {
		
	}
	
	public void atualizarSaldo(double reajuste) throws ValorInvalidoException{
		if(reajuste<=0) {
			throw new ValorInvalidoException();
		}else {
			this.setSaldo(this.getSaldo()+(this.getSaldo()*reajuste/100));
			this.reajusteMensal = (reajuste);
		}
	}
	
	public String toString() {
		return "Saldo R$ " + this.getSaldo() +
				"\nReajuste mensal " + this.reajusteMensal + "%";
	}

	protected double getReajusteMensal() {
		return reajusteMensal;
	}

	protected void setReajusteMensal(double reajusteMensal) {
		this.reajusteMensal = reajusteMensal;
	}
}
