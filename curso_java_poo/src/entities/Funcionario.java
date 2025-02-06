package entities;

public class Funcionario {

	private String nome;
	private Integer id;
	private Double salario;

	public Funcionario(String nome, Integer id, Double salario) {
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public Integer getId() {
		return id;
	}

	public Double getSalario() {
		return salario;
	}

	public Double aumentoSalario(Double percent) {
		return salario *= (1 + (percent / 100));
	}

	public String toString() {
		return getId()
			+ ", " + getNome()
			+ ", " + String.format("%.2f",getSalario());
	}
}
