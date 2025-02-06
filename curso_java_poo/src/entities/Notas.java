package entities;

public class Notas {

	public String nome;
	public double nota1, nota2, nota3;

	public double mediaFinal() {
		return nota1 + nota2 + nota3;
	}

	public String toString() {
		System.out.print("Média Final = " + String.format("%.2f", mediaFinal()) + "\n");
		
		if (mediaFinal() >= 60) {
			return "PASS";
		} else {
			return "FAILED\n FALTAM " + (60 - mediaFinal()) + "PONTOS";
		}
	}
}
