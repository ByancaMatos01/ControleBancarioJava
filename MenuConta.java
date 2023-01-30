package controleBancario;

import javax.swing.JOptionPane;

public class MenuConta extends Menu{
	private ContaCorrente contaCC;
	private ContaPoupanca contaCP;
	
	public void MenuConta() {
		ContaCorrente cc1 = new ContaCorrente(500, 1000);
		this.contaCC = cc1;
		ContaPoupanca cp1 = new ContaPoupanca(5000, 10);
		this.contaCP = cp1;
	}
	
	protected void executarMenu() {
		super.executarMenu();
		/*String opcoes[] = {"Sair", "Conta Corrente", "Conta Poupança"};
		do {
			this.setOpcao(JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]));
		}while(this.getOpcao()!=0);*/
	}
	
	protected void avaliarOpcaoEscolhida() {
		switch(this.getOpcao()) {
		case 1:
			operarContaCC();
			break;
		case 2:
			operarContaCP();
			break;
		case 0:
			
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida!", "Menu", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void operarContaCC() {
		int opcao;
		String opcoes[] = {"Voltar", "Consultar saldo", "Depositar", "Sacar", "Atualizar saldo"};
		opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu Conta Corrente", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
		switch(opcao) {
		case 1:
			JOptionPane.showMessageDialog(null, this.contaCC.toString(), "Conta Corrente", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			try {
				this.contaCC.depositar(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor para depósito", "Menu Conta Corrente", JOptionPane.QUESTION_MESSAGE)));
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "ERRO DE EXECUÇÃO: " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
			}
			break;
		case 3:
			try {
				this.contaCC.sacar(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor para saldo", "Menu Conta Corrente", JOptionPane.QUESTION_MESSAGE)));
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "ERRO DE EXECUÇÃO: " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
			}
			break;
		case 4:
			this.contaCC.atualizarSaldo();
			break;
		case 5:
			super.executarMenu();
			break;
		}
	}
	
	private void operarContaCP() {
		int opcao;
		String opcoes[] = {"Voltar", "Consultar saldo", "Depositar", "Sacar", "Atualizar saldo"};
		opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu Conta Poupança", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
		switch(opcao) {
		case 1:
			JOptionPane.showMessageDialog(null, this.contaCP.toString(), "Conta Poupança", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			try {
				this.contaCP.depositar(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor para depósito", "Menu Conta Poupança", JOptionPane.QUESTION_MESSAGE)));
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "ERRO DE EXECUÇÃO: " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
			}
			break;
		case 3:
			try {
				this.contaCP.sacar(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor para saque", "Menu Conta Poupança", JOptionPane.QUESTION_MESSAGE)));
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "ERRO DE EXECUÇÃO: " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
			}
			break;
		case 4:
			try {
				this.contaCP.atualizarSaldo(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor para reajuste", "Menu Conta Poupança", JOptionPane.QUESTION_MESSAGE)));
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "ERRO DE EXECUÇÃO: " + e, "ERRO", JOptionPane.ERROR_MESSAGE);	
			}
			break;
		case 5:
			super.executarMenu();
			break;
		
	}
	}
	
}