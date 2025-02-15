package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private LocalDate dueDate;
	private double amount;
	
	public Installment() {
		
	}
	
	public Installment(LocalDate dueDate, double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return getDueDate().format(fmt) + " - " + String.format("%.2f", getAmount());
	}
	
}
