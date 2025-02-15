package model.entities;

import model.exceptions.DomainException;

public class Account {
	private Integer numberAcc;
	private String holder;
	private Double balance;
	private Double withdraw;
	
	public Account() {
		
	}
	
	public Account(Integer numberAcc, String holder, Double balance, Double withdraw) {
		this.numberAcc = numberAcc;
		this.holder = holder;
		this.balance = balance;
		this.withdraw = withdraw;
	}
	
	public Integer getNumberAcc() {
		return numberAcc;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdraw() {
		return withdraw;
	}

	public void setNumberAcc(Integer numberAcc) {
		this.numberAcc = numberAcc;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void setWithdraw(Double withdraw) {
		this.withdraw = withdraw;
	}

	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) throws DomainException {
		if(amount > getWithdraw()) {
			throw new DomainException("Valor de saque é superior ao limite de saque");
		}
		if(amount > getBalance()) {
			throw new DomainException("Valor de saque é superior ao valor disponível em conta");
		}
		
		balance -= amount;
	}
	
	public String toString() {
		return "";
	}
	
}
