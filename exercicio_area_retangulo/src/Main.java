import java.util.Scanner;

import entities.Retangulo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Retangulo figura = new Retangulo();
		System.out.printf("Infome o tamanho da base: ");
		figura.base = sc.nextDouble();
		System.out.printf("Infome o tamanho da altura: ");
		figura.altura = sc.nextDouble();
		
		System.out.println("Area: "+figura.calculoArea());
		System.out.println("Perimetro: "+figura.calculoPerimetro());
		System.out.println("Diagonal: "+figura.calculoDiagonal());	
		
		
		sc.close();
	}

}
