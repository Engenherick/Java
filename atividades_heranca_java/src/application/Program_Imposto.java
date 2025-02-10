package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.ContribuinteFisico;
import entities.ContribuinteJuridico;

public class Program_Imposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		List<Contribuinte> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data");
			System.out.print("Individual or company (i/c)?");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Anual income: ");
			Double rendaAnual = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Health Expenditures: ");
				double gastoSaude = sc.nextDouble();

				list.add(new ContribuinteFisico(nome, rendaAnual, gastoSaude));
			} else if (ch == 'c') {
				System.out.print("Number of employees: ");
				Integer numFunc = sc.nextInt();

				list.add(new ContribuinteJuridico(nome, rendaAnual, numFunc));
			}

		}

		double sum = 0;
		System.out.println("TAXES PAID:");
		
		for (Contribuinte x : list) {
			System.out.println(x.toString());
			
			sum += x.impostoPago();
		}
		
		System.out.println();
		System.out.printf("Total Taxes paid: R$%.2f", sum);

		sc.close();
	}

}
