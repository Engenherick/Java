package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;	
	
	private Department dept;
	private List<HourContract> contratos = new ArrayList<>();

	public Worker(String name, WorkerLevel level, Double baseSalary, Department dept) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public void addContract(HourContract contract) {
		contratos.add(contract);
	}

	public void removeContract(HourContract contract) {
		contratos.remove(contract);
	}

	public Double income(Integer year, Integer month) {
		double income = baseSalary;
		
		for(HourContract x : contratos) {
			if( x.getDate().getMonthValue() == month && x.getDate().getYear() == year) {
				income += x.totalValue();
			}
		}
		
		return income;
	}

	public String toString(Double income, Integer year, Integer month) {
		return "Nome: " + getName() 
			 + "\nDepartment: " + dept.getName() 
			 + "\nValor recebido em " +month + "/" + year + ": R$"
			 + income;
	}

}
