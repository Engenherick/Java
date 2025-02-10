package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program_Product {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
		
			if (ch == 'c') {
				list.add(new Product(name, price));
			} else if (ch == 'u') {
				name = name.concat(" (used)");
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				String date = sc.nextLine();
				
				list.add(new UsedProduct(name, price, LocalDate.parse(date, fmt)));
				
			} else if (ch == 'i') {
				System.out.print("Customs fee: ");
				double customs = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, customs));
			}

		}
		
		for(Product x : list) {
			System.out.println(x.priceTag());
		}
		
		sc.close();
	}
}
