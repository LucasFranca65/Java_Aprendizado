import java.util.Locale;

public class A1_Main {
	
	public static void main(String[] args) {
		System.out.println("hello world");
		
		/* int y = 2;
		double x = 10.352148;
		String name = "Lucas França";
		int idade = 30;
		double salario = 10000.45;
		
		System.out.printf("O Cliente se chama %s e sua idade é %d e seu salario é de %.2f%n",name, idade, salario);		
		
		System.out.println("Valor de Y é :"+y);
		System.out.printf("Valor de X é:"+" %.2f%n",x);
		System.out.printf("Valor de X é:"+" %.4f%n",x);
		Locale.setDefault(Locale.US);
		System.out.printf("Valor de X é:"+" %.4f%n",x);
		System.out.printf("Valor de Y é %d", y);*/
		
		System.out.println("Exercicio de fixação ");
		
		//Variaveis 
		String produto1 = "Computador";
		String produto2 = "Impressora";
		
		int age = 30;
		int code = 3290;
		char gender = 'F';
		
		double price1 = 2100;
		double price2 = 650.52;
		double measure = 53.234567;
		
		//Retorno dos dados 
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", produto1, price1 );
		System.out.printf("%s, which price is $ %.2f%n", produto2, price2 );
		System.out.printf("%n");		
		System.out.printf("Record: %d years old, code %d and gender: %s%n  ", age, code, gender );
		System.out.printf("%n");
		System.out.printf("Measue with eight decimal places: %f%n ", measure );
		System.out.printf("Rouded (there decimal places): %.3f%n",measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		

	}

}