package aplication;

import java.util.Scanner;

import utils.Calculator;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Infome o raio: ");
		double r = sc.nextDouble();
		
		System.out.printf("Circuferencia: %.2f ",Calculator.circunference(r) );
		System.out.printf("Volume: %.2f ",Calculator.volume(r) );
		
		
		sc.close();

	}

}
