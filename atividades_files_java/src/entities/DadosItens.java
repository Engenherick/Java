package entities;

public class DadosItens {
	private String nome;
	private Double price;
	private Integer qty;

	public DadosItens() {

	}

	public DadosItens(String nome, Double price, Integer qty) {
		this.nome = nome;
		this.price = price;
		this.qty = qty;
	}

	public String getNome() {
		return nome;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQty() {
		return qty;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
	public Double valorTotal() {
		return getPrice() * getQty();
	}
	
	

}
