package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program_Worker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		
		System.out.print("Qual o departamento? ");
		Department dept = new Department(sc.next());
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Insira os dados do colaborador:");

		System.out.print("Nome: ");
		sc.nextLine();
		String workerName = sc.nextLine();
		System.out.print("Nível: ");
		String levelWorker = sc.nextLine();
		System.out.print("Salário Base: ");
		Double basisWorker = sc.nextDouble();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(levelWorker), basisWorker, dept);

		System.out.print("Quantos contratos este colaborador tem? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Insira o " + (i + 1) + "º contrato");
			System.out.print("Data (dd/mm/yyyy): ");
			String dateString = sc.next();
			LocalDate date = LocalDate.parse(dateString, fmt1);

			System.out.print("Valor por hora: ");
			Double valuePerHour = sc.nextDouble();

			System.out.print("Duração (Horas): ");
			Integer duration = sc.nextInt();

			HourContract contratoNovo = new HourContract(date, valuePerHour, duration);

			worker.addContract(contratoNovo);
		}

		System.out.print("Insira o mês e o ano para calcular o dinheiro recebido (mm/yyyy): ");
		String dateString = sc.next();
		LocalDate date = LocalDate.parse("01/" + dateString, fmt1);

		Double income = worker.income(date.getYear(), date.getMonthValue());

		System.out.println(worker.toString(income, date.getYear(), date.getMonthValue()));
		StringBuilder sb = new StringBuilder();
		
		sc.close();
	}

}
