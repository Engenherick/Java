package application;

import java.util.Scanner;

import entities.Cotacao;

public class Program_Cotacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o valor do dolar? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("Quantos dólares você deseja comprar? ");
		double valorCompra = sc.nextDouble();
		
		System.out.printf("Valor a ser pago em R$ = %.2f", Cotacao.valorAPagar(valorCompra, dollarPrice));
		
		sc.close();
	}

}
