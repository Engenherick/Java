package entities;

public class DadosPessoas {
	private double altura;
	private char genero;
	
	public DadosPessoas(double altura, char genero) {
		this.altura = altura;
		this.genero = genero;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public char getGenero() {
		return genero;
	}
	
}
