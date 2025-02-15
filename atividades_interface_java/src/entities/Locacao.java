package entities;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Locacao {

	private LocalDateTime dataSaida, dataEntrada;
	private Invoice invoice;
	private Vehicle vehicle;

	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

	public Locacao() {

	}

	public Locacao(LocalDateTime dataSaida, LocalDateTime dataEntrada, Vehicle vehicle) {
		this.dataSaida = dataSaida;
		this.dataEntrada = dataEntrada;
		this.vehicle = vehicle;
	}

	public LocalDateTime getDataSaida() {
		return dataSaida;
	}

	public LocalDateTime getDataEntrada() {
		return dataEntrada;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setDataSaida(LocalDateTime dataSaida) {
		this.dataSaida = dataSaida;
	}

	public void setDataEntrada(LocalDateTime dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
}
