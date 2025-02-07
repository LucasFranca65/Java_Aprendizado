package entities;

public class Retangulo {
	
	public double base;
	public double altura;
	
	
	public double calculoArea() {
		return base*altura;
	}
	
	public double calculoPerimetro() {
		return 2*(base+altura);
	}
	
	public double calculoDiagonal() {
		return Math.sqrt(Math.pow(altura, 2)+Math.pow(base, 2));
	}
}
