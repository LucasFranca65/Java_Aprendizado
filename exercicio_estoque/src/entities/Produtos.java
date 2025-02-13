package entities;

public class Produtos {
	public String name;
	public double price;
	public int qtd;
	
	public double TotalValueStock() {
		return (double) price * qtd;
	}
	
	public void AddProducts(int quantity) {
		qtd += quantity;
		System.out.println("Entrada realizada! Saldo atual: " + qtd);
	}
	
	public void RemoveProducts(int quantity) {
		if (qtd == 0) {
			System.out.println("Produto com saldo Zerado !!");
		}else if(quantity > qtd) {
			System.out.println("Saldo insuficiente! Saldo atual: " + qtd);
		}else {
			qtd -= quantity;
			System.out.println("Saida realizada! Saldo atual: " + qtd);
		}
	}
	
	
	public String toString() {
		
		return "Nome: "+name+" "
				+"Saldo:  "+ qtd + " "
				+"Preço: R$ "+String.format("%.2f", price) + " "
				+"Total: R$ " + String.format("%.2f", TotalValueStock())
				;		
		
	}
	
	
	
}
