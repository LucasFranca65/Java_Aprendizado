import java.util.Scanner;

import entities.Aluno;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno aln = new Aluno();
		
		System.out.println("infome o nome: ");
		aln.name = sc.nextLine();
		System.out.println("(min 0 max 30 )N1: ");
		aln.n1 = sc.nextInt();
		System.out.println("(min 0 max 35 )N2: ");
		aln.n2 = sc.nextInt();
		System.out.println("(min 0 max 35 )N3: ");
		aln.n3 = sc.nextInt();
		
		System.out.println(aln.toString());
		aln.verificarNotas();
		
		sc.close();
	}

}
