package entities;

public class Triangle {
	
	//atributos publicos
	public double a, b, c;
	
	//metodos publicos
	public double calculateArea() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}