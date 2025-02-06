package entities;

public class Banco {

	private int numConta;
	private String nome;
	private double saldo;
	
	public Banco(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
	}
	
	public Banco(int numConta, String nome, double depInicial) {
		this.numConta = numConta;
		this.nome = nome;
		deposito(depInicial);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor + 5.0;
	}
	
	public String toString(){
		return "Dados da conta:\n"
			 + "Conta " + getNumConta()
			 + ", Dono: " + getNome()
			 + ", Saldo: " + String.format("%.2f", getSaldo())
			 + "\n";		
	}
	
}
