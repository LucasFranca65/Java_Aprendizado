import java.util.Scanner;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		
		x = new Triangle();
		y = new Triangle();

		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c= sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		System.out.println("A area do Triangulo X é: "+ x.calculateArea());
		System.out.println("A area do Triangulo y é: "+ y.calculateArea());
		
		if(x.calculateArea() > y.calculateArea()) {
			System.out.println("A maior area é do Triangulo X -> "+ x.calculateArea());
		}else if(x.calculateArea() == y.calculateArea()){
			System.out.println("X e Y são triangulos de mesma area -> "+ x.calculateArea() +" e "+y.calculateArea());
		}else {
			System.out.println("A maior area é do Triangulo Y -> "+ y.calculateArea());
		}
		
		sc.close();
	}

}
