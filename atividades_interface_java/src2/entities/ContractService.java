package entities;

import java.time.LocalDate;

import services.OnlinePaymentService;
import services.PaypalService;

public class ContractService {
	
	private OnlinePaymentService service;
			
	public ContractService(OnlinePaymentService service) {
		this.service = service;
	}

	public void processContract(Contract contract, int month) {
		
		double valorParcelaBase = contract.getTotalValue()/month;
		
		for (int i = 1; i <= month; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			double interest = service.interest(valorParcelaBase, i);
			double fee = service.paymentFee(valorParcelaBase);
			double valorParcela = valorParcelaBase + interest + fee;
			
			contract.addInstallment(dueDate, valorParcela);
		}
	}
}
