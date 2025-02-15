package services;

import java.time.Duration;

import entities.Invoice;
import entities.Locacao;

public class RentalService {
	private Double priceHour, priceDay;
	private TaxService txService;

	public RentalService(Double priceHour, Double priceDay, TaxService txService) {
		this.priceHour = priceHour;
		this.priceDay = priceDay;
		this.txService = txService;
	}

	public Double getPriceHour() {
		return priceHour;
	}

	public Double getPriceDay() {
		return priceDay;
	}

	public void setPriceHour(Double priceHour) {
		this.priceHour = priceHour;
	}

	public void setPriceDay(Double priceDay) {
		this.priceDay = priceDay;
	}

	public void setTxService(BrazilTaxService txService) {
		this.txService = txService;
	}

	public void processInvoice(Locacao cr) {

		double minutes = Duration.between(cr.getDataSaida(), cr.getDataEntrada()).toMinutes();
		double hours = minutes / 60;

		double basicPayment;

		if (hours > 12) {
			basicPayment = Math.ceil(hours / 24) * getPriceDay();
		} else {

			basicPayment = Math.ceil(hours) * getPriceHour();
		}

		double tax = txService.tax(basicPayment);

		cr.setInvoice(new Invoice(basicPayment, tax));
	}
}
