package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program_Funcionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employeeList = new ArrayList<>();
		Employee employee = new Employee();
		
		System.out.print("Quantos funcionários serão inseridos? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data");
			System.out.print("Outsourced (y/n)?");
			char outsourced = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(outsourced == 'n') {
				employee = new Employee(name, hours, valuePerHour);
			}else if (outsourced == 'y') {
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
			}
			
			employeeList.add(employee);
		}
		
		System.out.println("PAYMENTS:");
		for(Employee emp : employeeList) {
			System.out.println(emp.getName() + " - R$" + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}

}
