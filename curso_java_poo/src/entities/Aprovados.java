package entities;

public class Aprovados {
	
	private String nome;
	private double nota1;
	private double nota2;
	
	public Aprovados(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getNota1() {
		return nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public double mediaFinal(){
		return (getNota1() + getNota2())/2;
	}
}
