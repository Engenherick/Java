package entities;

public class Contribuinte {

	private String name;
	protected Double rendaAnual;
	protected Double valorImposto;
	
	public Contribuinte() {
		
	}	

	public Contribuinte(String name, Double rendaAnual) {
		this.name = name;
		this.rendaAnual = rendaAnual;
	}

	public String getName() {
		return name;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public Double getValorImposto() {
		return valorImposto;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public void setValorImposto(Double valorImposto) {
		this.valorImposto = valorImposto;
	}

	public  Double impostoPago() {
		return getRendaAnual() * getValorImposto();		
	}
	
	public String toString() {
		return getName() + ": R$" + String.format("%.2f", impostoPago());
		
	}

}
