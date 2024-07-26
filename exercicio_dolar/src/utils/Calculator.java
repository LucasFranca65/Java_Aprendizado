package utils;

public class Calculator {
	
	public static final double IOF = 6.0;
	
	public static double calclularCompra(double vDolar, double vCompra) {
		
		return (vDolar * vCompra) +  (vDolar * vCompra)*IOF/100; 
	}
}
