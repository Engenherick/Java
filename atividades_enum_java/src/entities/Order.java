package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); 
	
	private LocalDateTime moment;
	private OrderStatus status;

	private Client client = new Client();
	private List<OrderItem> items = new ArrayList<>();

	public Order() {

	}

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Double total() {
		Double sum = 0.0;
		for (OrderItem x : items) {
			sum += x.getProduct().getPrice() * x.getQuantity();
		}
		return sum;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n\nORDER SUMMARY:\n");
		sb.append("Order moment: " + getMoment().format(fmt) + "\n");
		sb.append("Order Status: " + getStatus() + "\n");
		sb.append("Client: " + client.getName() + "(" + client.getBirthDate() + ") - " + client.getEmail());
		sb.append("\nOrder Items:\n");

		for (OrderItem x : items) {
			sb.append(x.getProduct().getName() + ", R$" + String.format("%.2f", x.getProduct().getPrice())
					+ ", Quantidade: " + x.getQuantity() + ", Subtotal: R$" + String.format("%.2f", x.subtotal())
					+ "\n");
		}

		sb.append("Valor total: R$" + String.format("%.2f", total()));

		return sb.toString();
	}
}
