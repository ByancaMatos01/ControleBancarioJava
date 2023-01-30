package controleBancario;

public class Conta {
	private double saldo;
	
	public Conta(double vSaldo) {
		this.saldo = vSaldo;
	}
	
	public Conta() {
		
	}
		
	protected double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) throws ValorInvalidoException  {
		if(valor<=0) {
			throw new ValorInvalidoException();
		}else {
			this.saldo = (this.saldo + valor);
		}
	}
	
	public void sacar(double valor) throws ValorInvalidoException, SaldoInsuficienteException{
		if(valor<=0) {
			throw new ValorInvalidoException();
		}else if(valor>this.saldo) {
			throw new SaldoInsuficienteException();
		}else {
			this.saldo = (this.saldo-valor);
		}
	}
	
	public void atualizarSaldo() {
		if(this.saldo<0) {
			this.saldo = (this.saldo+(this.saldo*0.08));
		}
	}
}

	