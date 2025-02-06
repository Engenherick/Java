package application;

import java.util.Random;
import java.util.Scanner;

public class Program_Matrix {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		//System.out.print("Insira o valor da Matriz: ");
		int n = random.nextInt(5) + 1;
		int negativeNumber = 0;
		
		Integer[][] matrix = new Integer[n][n];
		
		System.out.println();
		
		for(int i = 0; i< n; i++) {
			for(int j = 0 ; j < n; j++) {
				matrix[i][j] = random.nextInt(21) - 10;
				if(matrix[i][j] < 0) {
					negativeNumber += 1;
				}
				System.out.printf("%d ", matrix[i][j]);
			} 
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Main Diagonal:");
		
		for(int i = 0; i<n ; i++) {
			System.out.printf("%d ",matrix[i][i]);
		}
		System.out.println();
		System.out.printf("Numeros Negativos = %d", negativeNumber);
		sc.close();
		
	}
	
}
