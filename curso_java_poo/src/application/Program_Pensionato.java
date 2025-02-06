package application;

import java.util.Scanner;

import entities.Pensionato;

public class Program_Pensionato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos quartos serão alugados?");
		int n = sc.nextInt();

		Pensionato[] quartos = new Pensionato[10];

		for (int i = 0; i < n; i++) {
			System.out.println("Quarto #" + (i + 1));
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quartoEscolhido = sc.nextInt();

			quartos[quartoEscolhido] = new Pensionato(nome, email, quartoEscolhido);
		}

		System.out.println("Relatório de Alugueis: ");
		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.println(quartos[i].toString());
			}
		}
		sc.close();
	}

}
