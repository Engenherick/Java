package application;

import java.util.Scanner;
import entities.DadosFunc;

public class Program_DadosFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fazer um programa para ler os dados de um funcionario (nome, salário bruto e
		 * imposto). Em seguida, mostrar os dados do funcionário (nome e salario
		 * liquido). Em seguida, aumentar o salário do funcionário com base em uma
		 * porcentagem dada (somente o salário do funcionário é afetado pela
		 * porcentagem) e mostrar novamente os dados do funcionário.
		 */

		Scanner sc = new Scanner(System.in);
		DadosFunc funcionario = new DadosFunc();
		
		System.out.print("Nome: ");
		funcionario.name = sc.next();
		
		System.out.print("Salário Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("\n" + funcionario);
		
		System.out.print("\nQual o percentual para aumento de salário? ");
		double percent = sc.nextDouble();
		funcionario.AumentoSalario(percent);
		
		System.out.println("\n" + funcionario);
		
		sc.close();
	}

}
