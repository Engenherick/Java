package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Locacao;
import entities.Vehicle;
import services.BrazilTaxService;
import services.RentalService;

public class ProgramLocacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.print("Input car model: ");
		String carModel = sc.nextLine();
		System.out.print("Input data saída: ");
		LocalDateTime dataSaida = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Input data entrada: ");
		LocalDateTime dataEntrada = LocalDateTime.parse(sc.nextLine(), fmt);
				
		Locacao locacao = new Locacao(dataSaida, dataEntrada, new Vehicle(carModel));
		
		System.out.print("Enter price per hour: ");
		Double valorHora = sc.nextDouble();
		System.out.print("Enter price per daily: ");
		Double valorDiaria = sc.nextDouble();
		
		RentalService service = new RentalService(valorHora, valorDiaria, new BrazilTaxService());
		
		service.processInvoice(locacao);
		
		System.out.print("Fatura: ");
		System.out.print("\nBasic Payment: " + String.format("%.2f", locacao.getInvoice().getBasicPayment()));
		System.out.print("\nTax: " + String.format("%.2f", locacao.getInvoice().getTax()));
		System.out.print("\nTotal Payment: " + String.format("%.2f", locacao.getInvoice().totalPayment()));
		
		
		sc.close();
	}

}
