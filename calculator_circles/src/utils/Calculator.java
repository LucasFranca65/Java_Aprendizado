package utils;

public class Calculator {
	
	public static final double PI = 3.14159;
	
	public static double circunference(double radiuns) {
		return 2.0 * PI * radiuns; 
	}
	
	public static double volume(double radiuns) {
		return 4.0 * PI * Math.pow(radiuns, 3) / 3.0; 
	}
	
	
}
