import java.util.Scanner;
import entities.Produtos;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Produtos prod1 = new Produtos();
		//int editQtd = 0;
		
		System.out.printf("Nome: ");
		prod1.name = sc.nextLine();
		System.out.printf("Saldo: ");
		prod1.qtd = sc.nextInt();
		System.out.printf("Preço: ");
		prod1.price = sc.nextDouble();
		
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
