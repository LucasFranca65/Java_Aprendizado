package aplication;

import java.util.Scanner;

import utils.Calculator;

public class Index {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Cotação atual do dolar: ");
		double dol = sc.nextDouble();
		System.out.print("Valor que deseja comprar em dola: ");
		double comp = sc.nextDouble();
		
		System.out.printf("Valor necessario em reais é R$ %.2f%n", Calculator.calclularCompra(dol, comp));
		System.out.println("Taxa IOF sobre compra" + Calculator.IOF );
		
		sc.close();
		

	}

}
