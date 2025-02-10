package entities;

public class ContribuinteFisico extends Contribuinte {

	private Double gastoSaude;

	public ContribuinteFisico() {
		super();
	}

	public ContribuinteFisico(String name, Double rendaAnual, Double gastoSaude) {
		super(name, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double impostoPago() {
		if (getRendaAnual() >= 20000) {
			setValorImposto(0.25);
		} else {
			setValorImposto(0.15);
		}

		return super.impostoPago() - getGastoSaude() * 0.5;
	}

}
