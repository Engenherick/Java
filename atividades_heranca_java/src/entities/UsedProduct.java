package entities;

import java.time.LocalDate;

public class UsedProduct extends Product {
	private LocalDate date;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, LocalDate date) {
		super(name, price);
		this.date = date;
	}
	
	@Override
	public String priceTag() {
		return super.priceTag() + "(Manufacture date: " + date + ")";
	}
	
}
