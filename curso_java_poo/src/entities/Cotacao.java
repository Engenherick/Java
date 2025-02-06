package entities;

public class Cotacao {

	public static final double IOF = 0.06;
	
	public static double valorAPagar(double valorCompra, double dollarPrice){
		return valorCompra * dollarPrice * (1+IOF);
	} 

}
