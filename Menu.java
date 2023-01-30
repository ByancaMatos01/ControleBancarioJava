package controleBancario;

import javax.swing.JOptionPane;

public abstract class Menu {
	private int opcao;
	private String mensagemMenu;
	
	protected int getOpcao() {
		return opcao;
	}

	protected void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	protected String getMensagemMenu() {
		return mensagemMenu;
	}

	protected void setMensagemMenu(String mensagemMenu) {
		this.mensagemMenu = mensagemMenu;
	}

	
	public void executar() {
		
	}
	
	protected void executarMenu() {
		String opcoes[] = {"Sair", "Conta Corrente", "Conta Poupança"};
		do {
			this.opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
		}while(this.opcao!=0);
	}
	
	protected void avaliarOpcaoEscolhida() {
		
	}

}