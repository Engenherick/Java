package entities;

public class ContribuinteJuridico extends Contribuinte {

	private Integer numFunc;

	public ContribuinteJuridico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContribuinteJuridico(String name, Double rendaAnual, Integer numFunc) {
		super(name, rendaAnual);
		this.numFunc = numFunc;
	}
	
	public Integer getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(Integer numFunc) {
		this.numFunc = numFunc;
	}

	@Override
	public Double impostoPago() {
		if(getNumFunc() > 10){
			setValorImposto(0.14);
		}else {
			setValorImposto(0.16);	
		}
		
		return super.impostoPago();
		}
}
