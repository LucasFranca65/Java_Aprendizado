package entities;

import java.util.Date;

public class Order {
	private Date date;
	private Produtos product;
	
	public Order(Date date, Produtos product) {
		super();
		this.date = date;
		this.product = product;
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Produtos getProduct() {
		return product;
	}

	public void setProduct(Produtos product) {
		this.product = product;
	}
	
	
	
	
	
}
