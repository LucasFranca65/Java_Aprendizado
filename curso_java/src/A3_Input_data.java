import java.util.Scanner;
public class A3_Input_data {

	public static void main(String[] args) {
		//Exemplos de input 
		
		Scanner sc = new Scanner(System.in);
		String aluno ;
		double n1, n2, n3, media;
		System.out.println("Informe o nome do aluno: ");
		aluno = sc.nextLine();
		System.out.println("Informe a primeira nota: ");
		n1 = sc.nextDouble();
		System.out.println("Informe a segunda nota: ");
		n2 = sc.nextDouble();
		System.out.println("Informe a terceira nota: ");
		n3 = sc.nextDouble();
		
		media = (n1+n2+n3)/3;
		
		System.out.printf("A media do aluno %s é %.2f ", aluno, media);
		
		
		
		
		
		
		
		sc.close();
	}

}
