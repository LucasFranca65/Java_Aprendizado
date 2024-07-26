import java.util.Scanner;

public class A7_Functions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
			
		
		System.out.printf("Intome o primeiro inteiro: ");
		a = sc.nextInt();				
		System.out.printf("Intome o segundo inteiro: ");
		b= sc.nextInt();
		System.out.printf("Intome o terceiro inteiro: ");
		c = sc.nextInt();
		
		resultado(max(a,b,c));
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		
		if(x > y && x > z) {
			return x;
			
		}else if(y > z) {
			return y;
			
		}else {
			return z;
		}	
	}
	
	public static void resultado(int x) {
		System.out.println("O maior valor é "+x);
	}

}
