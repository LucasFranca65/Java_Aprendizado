package entities;

public class Produtos {
	
	String name;
	double price;
	int qtd;
	
	
	
	// Construtores com sobrecarga
	public Produtos() {
		
	}
	public Produtos(String name, double price, int qtd) {
		super();
		this.name = name;
		this.price = price;
		this.qtd = qtd;
	}
	public Produtos(String name, double price) {
		super();
		this.name = name;
		this.price = price;	
	}	
	
	//Geters e Seters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtd() {
		return qtd;
	}
	
	public double TotalValueStock() {
		return (double) price * qtd;
	}
	
	
	//metodos 
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