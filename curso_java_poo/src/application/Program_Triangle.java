package application;

import java.util.Scanner;
import entities.Triangle;

public class Program_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		Scanner sc = new Scanner(System.in);
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		System.out.println(x.area());
		System.out.println(y.area());
		
		sc.close();
		
	}

}
