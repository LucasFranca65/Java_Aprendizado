package aplication;

import java.util.Scanner;

import entities.Conta;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Conta newConta;
		
		System.out.print("Informe o nome do cliente: ");
		String nameCliente = sc.nextLine();
		
		System.out.print("Informe o numero da conta: ");
		int numero = sc.nextInt();
		
		System.out.print("deseja realizar deposito inicial ? S / N: ");
		char deposito = sc.next().charAt(0);
		
		if(deposito == 's' || deposito == 'S') {
			System.out.print("Infome o valor inicial do deposito: ");
			double valor = sc.nextDouble();
			newConta = new Conta(numero, nameCliente, valor );			
		}else {
			newConta = new Conta(numero, nameCliente );	
		}
		
		System.out.println(newConta.toString());
		
		
		System.out.print("Infome o valor de deposito: ");
		newConta.deposito(sc.nextDouble());
		System.out.println(newConta.toString());
		
		
		System.out.print("Infome o valor de saque: ");
		newConta.saque(sc.nextDouble());
		System.out.println(newConta.toString());
		
		
		sc.close();
	}

}
