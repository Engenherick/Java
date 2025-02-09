package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program_Pedido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Client client = new Client();
		Order order = new Order();
		OrderItem orderItem = new OrderItem();
		Product product = new Product();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		System.out.println("Digite os dados do cliente: ");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("E-mail: ");
		String clientEmail = sc.nextLine();
		System.out.print("Data de Nascimento (dd/mm/yyyy): ");
		String clientBirth = sc.nextLine();
					
		client = new Client(clientName, clientEmail, LocalDate.parse(clientBirth, fmt));
		
		System.out.println("Digite o dado do pedido:");
		System.out.print("Status: ");
		String orderStatus = sc.nextLine();
		System.out.print("Quantos itens existem nesse pedido?");
		int orderQty = sc.nextInt();
		
		LocalDateTime moment = LocalDateTime.now();
		order = new Order(moment, OrderStatus.valueOf(orderStatus), client);
		
		for (int i = 1; i <= orderQty; i++) {
			System.out.println("Insira os dados do " + i + "º item");
			System.out.print("Nome do Produto:");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Preço do Produto: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantidade: ");
			Integer productQty = sc.nextInt();
			
			product = new Product(productName, productPrice);
			orderItem = new OrderItem(productQty, product);
			order.addItem(orderItem);
		}		
		
		System.out.println(order.toString());
		
		sc.close();
	}

}
