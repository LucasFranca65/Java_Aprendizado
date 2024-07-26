import java.util.Scanner;

import entities.Produtos;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Nome: ");
		String name = sc.nextLine();
		
		System.out.printf("Saldo: ");
		int qtd = sc.nextInt();
		
		System.out.printf("Preço: ");
		double  price = sc.nextDouble();
			
		
		Produtos prod1 = new Produtos(name, price, qtd);
		
		System.out.printf("Nome: %s, preço: %.2f, Quantidade %d ", prod1.getName(), prod1.getPrice(), prod1.getQtd());
	
		System.out.println(prod1.toString());
		System.out.println("---------------------------------------------------");
		System.out.printf("Informe a quantidade que dezeja almentar no estoque: ");
		int qtdEdit = sc.nextInt();
		prod1.AddProducts(qtdEdit);
		System.out.println(prod1.toString());
		System.out.printf("Informe a quantidade que dezeja diminuir no estoque: ");
		qtdEdit = sc.nextInt();
		prod1.RemoveProducts(qtdEdit);		
		System.out.println(prod1.toString());
			
		
		sc.close();
	}

}
