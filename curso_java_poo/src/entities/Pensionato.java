package entities;

public class Pensionato {

	public String nome, email;
	public int quartoEscolhido;

	public Pensionato(String nome, String email, int quartoEscolhido) {
		this.nome = nome;
		this.email = email;
		this.quartoEscolhido = quartoEscolhido;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public int getQuartoEscolhido() {
		return quartoEscolhido;
	}

	public String toString() {
		return getQuartoEscolhido() + ": " + getNome() + ", " + getEmail();
	}
}
