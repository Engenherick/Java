package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class ProgramBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial Balance: ");
			Double initBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double limitWith = sc.nextDouble();
			
			Account account = new Account(number, holder, initBalance, limitWith);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			Double withdrawValue = sc.nextDouble();
			
			account.withdraw(withdrawValue);
			
			System.out.println("New balance: " + account.getBalance());
						
		}
		catch(DomainException e){
			System.out.println("Erro: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Error unexpected");
		}
		sc.close();

	}

}
