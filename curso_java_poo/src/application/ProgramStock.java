package application;

import java.util.Scanner;
import entities.Product;

public class ProgramStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Product item;
		
		item = new Product();
		
		System.out.println("Informe o nome do Produto:");
		item.name = sc.next();
		System.out.println("Informe o valor de " + item.name + ":");
		item.price = sc.nextDouble();
		System.out.println("Informe a quantidade de " + item.name + ":");
		item.quantity = sc.nextInt();
		
		int ope = 0;
		int quantidade = 0;
		
		System.out.println(item);
		
		while(ope != 3) {
			System.out.println("");
			System.out.println("Defina a operação que deseja:");
			System.out.println("1. Entrada de mercadoria");
			System.out.println("2. Saída de mercadoria");
			System.out.println("3. Sair do Programa");
			
			ope = sc.nextInt();			
			
			if(ope == 1) {
				item.AddProducts(quantidade = sc.nextInt());
			}else if (ope == 2) {
				item.RemoveProducts(quantidade = sc.nextInt());
			}
			
			System.out.println(item.toString());
		}
		
		System.out.println("Programa finalizado...");
		
		sc.close();
		
	}

}
