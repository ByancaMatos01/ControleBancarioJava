package controleBancario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner meuScanner = new Scanner(System.in);
		double valor;
		ContaCorrente minhaCC = new ContaCorrente();
		ContaPoupanca minhaCP = new ContaPoupanca();
		minhaCC.setSaldo(-100);
		minhaCP.setSaldo(100);
		System.out.println(minhaCC.toString());
		minhaCC.atualizarSaldo();
		System.out.println(minhaCC.toString());
		System.out.println(minhaCP.getSaldo());
		try{
			System.out.println("Informe valor para depósito");
			valor = meuScanner.nextDouble();
			minhaCP.depositar(valor);
			System.out.println("Informe o percentual do reajuste");
			valor = meuScanner.nextDouble();
			valor = (valor);
			minhaCP.atualizarSaldo(valor);			
			System.out.println(minhaCP.toString());
			System.out.println("Informe o valor para saque");
			minhaCP.sacar(meuScanner.nextDouble());
		}catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Digite apenas números");
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}		
		System.out.println(minhaCP.toString());
	}
}