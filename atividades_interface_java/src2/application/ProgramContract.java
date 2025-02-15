package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contract;
import entities.ContractService;
import entities.Installment;
import services.PaypalService;

public class ProgramContract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre os dados do contrato:");
		System.out.print("Número da conta: ");
		int numeroConta = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		sc.nextLine();
		LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
		System.out.print("Valor do Contrato: ");
		double valorContrato = sc.nextDouble();
		System.out.print("Quantidade de parcelas: ");
		int qtyParcela = sc.nextInt();

		Contract contract = new Contract(numeroConta, date, valorContrato);
		ContractService service = new ContractService(new PaypalService());

		service.processContract(contract, qtyParcela);
		
		System.out.println("Parcelas:");
		for (Installment inst : contract.getInstallment()) {
			System.out.println(inst);
		}

		sc.close();
	}

}
