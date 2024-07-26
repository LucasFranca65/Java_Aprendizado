package entities;

public class Funcionario {
	public String name;
	public double salary;
	public double tax;
	
	
	
	public void almentarSalario(int pct) {
		salary += (pct*salary)/100;
	}
	
	
	public String toString() {
		return name + " , salario bruto R$ " + salary + ", salario liquido R$ "+ (salary-tax);
	}
	
}
