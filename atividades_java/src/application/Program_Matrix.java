package application;

import java.util.Random;
import java.util.Scanner;

public class Program_Matrix {

	public static void main(String[] args) {
		exe_fix02();
	}

	public static void exe_fix01() {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		// System.out.print("Insira o valor da Matriz: ");
		int n = random.nextInt(5) + 1;
		int negativeNumber = 0;

		Integer[][] matrix = new Integer[n][n];

		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = random.nextInt(21) - 10;
				if (matrix[i][j] < 0) {
					negativeNumber += 1;
				}
				System.out.printf("%d ", matrix[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Main Diagonal:");

		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", matrix[i][i]);
		}
		System.out.println();
		System.out.printf("Numeros Negativos = %d", negativeNumber);
		sc.close();

	}

	public static void exe_fix02() {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int lin = rand.nextInt(5);
		int col = rand.nextInt(5);

		Integer[][] mat = new Integer[lin][col];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = rand.nextInt(21) - 10;
				System.out.printf("%d ", mat[i][j]);
			}
			System.out.println();
		}

		System.out.println("Insira o número que você deseja a posição e as redondezas: ");
		int numEsc = sc.nextInt();
	
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (numEsc == mat[i][j]) {

					System.out.println("Position " + i + "," + j);
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Cima: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Direita: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Baixo: " + mat[i + 1][j]);
					}
					System.out.println();
				}
			}
		}
	}

	// sc.close();

}
