package entities;

public class DadosFunc {
	
	public String name;
	public double salarioBruto;
	public double imposto;
	

	public double SalarioLiq() {
		return salarioBruto - imposto;
	}
	
	public void AumentoSalario (double percent) {
		salarioBruto *= 1 + (percent/100);
	}
	
	public String toString() {
		return "Funcionário: " + name + ", R$" + String.format("%.2f",SalarioLiq());
	}
}
