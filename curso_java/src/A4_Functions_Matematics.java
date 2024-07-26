import java.util.Scanner;

public class A4_Functions_Matematics {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x, y, z, A,B,C;
		x = 3.0;
		y=4.0;
		z = -5.0;
		
		A= Math.sqrt(x);
		B= Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		
		//Raiz Quadrada
		System.out.println("A Raiz Quadrade de "+ x + " é = "+A);
		System.out.println("A Raiz Quadrade de "+ y + " é = "+B);
		System.out.println("A Raiz Quadrade de 25 "+ x + " é = "+C);
		
		A= Math.pow(x,y);
		B= Math.pow(x,2);
		C = Math.pow(5.0,2.0);
		
		//Potencia
		System.out.println("A Potencia de "+ x +" por " + y +" = "+A);
		System.out.println("A Potencia de "+ x +" por 2 = "+B);
		System.out.println("A Potencia de 5 por 2 = "+C);
		
		//Valor absoluto
		A= Math.abs(y);
		B=Math.abs(z);
		System.out.println("O valor absoluto de  "+ y +" por 2 = "+A);
		System.out.println("O valor absoluto de  "+ z +" por 2 = "+B);
		
		
		// Caçulo Bascara

		double a, b, c , delta, x1, x2;
		
		System.out.printf("Infome o Valor de a: ");
		a = sc.nextDouble();
		
		System.out.printf("Infome o Valor de b: ");
		b = sc.nextDouble();
		
		System.out.printf("Infome o Valor de c: ");
		c = sc.nextDouble();
		
		delta = Math.pow(b,2) - 4*a*c;
		
		if(delta < 0) {
			System.out.println("O valor de Delta = "+delta+" Não tem solução Real");
			
		}else if(delta == 0) {
			x1 = ( (-b + Math.sqrt(delta)) / 2*a);
			x2 = ( (-b - Math.sqrt(delta)) / 2*a);
			
			System.out.println("O valor de Delta = "+delta+" Conjunto solução possui apenas 1 resultado x1 e x2 iguais");
			System.out.println("O valor de X1 = "+x1);
			System.out.println("O valor de X2 = "+x2);
		}else {
			x1 = ( (-b + Math.sqrt(delta)) / 2*a);
			x2 = ( (-b - Math.sqrt(delta)) / 2*a);
			
			System.out.println("O valor de Desta = "+delta);
			System.out.println("O valor de X1 = "+x1);
			System.out.println("O valor de X2 = "+x2);
		}
		
		
		
		
		sc.close();
		
		
	}

}
