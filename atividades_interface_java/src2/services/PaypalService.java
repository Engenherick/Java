package services;

public class PaypalService implements OnlinePaymentService {

	private double interest;
	private double paymentFee;
	
	public double interest(double amount, int month) {
		return interest = amount * month * 0.01;
	}
	
	public double paymentFee(double amount) {
		return paymentFee = (interest + amount) * 0.02;
	}

}
