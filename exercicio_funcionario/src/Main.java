import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcionario fc1 = new Funcionario();
		
		System.out.printf("informe o nome: ");
		fc1.name = sc.nextLine();
		System.out.printf("informe o Satario bruto: ");
		fc1.salary = sc.nextDouble();
		System.out.printf("informe os descontos: ");
		fc1.tax = sc.nextDouble();
		
		System.out.println(fc1.toString());
		
		System.out.printf("Informe percentual de almento: ");
		fc1.almentarSalario(sc.nextInt());
		
		System.out.println(fc1.toString());
		
		
		
		sc.close();
	}

}
