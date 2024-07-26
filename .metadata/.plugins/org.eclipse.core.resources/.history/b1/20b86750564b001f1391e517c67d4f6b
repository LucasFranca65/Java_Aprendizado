package entities;

import java.util.Date;

public class Conta {
	
	int number;
	String cliente;
	double saldo;
	Date dateDep;
	Date dateSaq;
	double taxSaque = 5.00;
	
	public Conta(int number, String cliente, double saldo) {
		
		this.number = number;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public Conta(int number, String cliente) {
		
		this.number = number;
		this.cliente = cliente;		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	public void deposito(double valor) {
		this.saldo += valor;
		dateDep = new Date();
		System.out.printf("Deposito de %.2f realizado com sucesso!%n",valor);
	}
	
	public void saque(double valor) {
		this.saldo -= (valor + taxSaque);
		dateSaq = new Date();
		System.out.printf("Saque de %.2f realizado com sucesso!%n", valor);
	}
	
	public String toString() {
		return String.format("%nNome do Cliente: %s%nNúmero da conta: %d%nSaldo Atual: %.2f%nUltimo saque: %s%nUltimo deposito: %s%n ", cliente, number,saldo, dateSaq, dateDep );
	}
	
}
