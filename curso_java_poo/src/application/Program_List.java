package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

public class Program_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsandoEntities();
		
		/*Scanner sc = new Scanner(System.in);

		System.out.print("Quantos funcionários serão incluídos? ");
		int n = sc.nextInt();

		List<String> nome = new ArrayList<>();
		List<Integer> id = new ArrayList<>();
		List<Double> salario = new ArrayList<>();
		Integer verId;

		for (int i = 0; i < n; i++) {

			System.out.print("ID: ");
			Integer novoId = sc.nextInt();
			verId = id.indexOf(novoId);

			if (verId == -1) {
				id.add(novoId);

				System.out.print("Nome: ");
				sc.nextLine();
				nome.add(sc.nextLine());

				System.out.print("Salário: ");
				salario.add(sc.nextDouble());

			} else {
				System.out.println("ID já utilizado, insira outro");
				i -= 1;
			}

		}

		System.out.print("Insira o ID do funcionario que irá receber um aumento: ");
		Integer aumentoID = sc.nextInt();
		verId = id.indexOf(aumentoID);

		if (verId != -1) {
			System.out
					.print("Insira a porcentagem de aumento que " + nome.get(id.indexOf(aumentoID)) + " irá receber: ");
			Double percent = sc.nextDouble();

			Double novoSalario = salario.get(id.indexOf(aumentoID)) * (1 + percent / 100);

			salario.remove(id.indexOf(aumentoID));
			salario.add(id.indexOf(aumentoID), novoSalario);
		} else
			System.out.println("Esse ID não existe");

		System.out.println("Lista de empregados: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d, %s, %.2f%n", id.get(i), nome.get(i), salario.get(i));
		}

		sc.close();
		*/
	}

	public static void UsandoEntities() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos funcionários serão incluídos? ");
		int n = sc.nextInt();

		List<Funcionario> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			System.out.print("ID: ");
			Integer ID = sc.nextInt();

			if (hasID(list, ID) == -1) {

				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();

				System.out.print("Salário: ");
				Double salario = sc.nextDouble();

				Funcionario func = new Funcionario(nome, ID, salario);

				list.add(func);

			} else {
				System.out.println("ID já utilizado, insira outro");
				i -= 1;
			}

		}

		System.out.print("Insira o ID do funcionario que irá receber um aumento: ");
		Integer aumentoID = sc.nextInt();
		Integer index = hasID(list, aumentoID);
		if (hasID(list, aumentoID) == 0) {
			System.out.print("Insira a porcentagem de aumento que " + list.get(index).getNome() + " irá receber: ");
			Double percent = sc.nextDouble();

			list.get(index).aumentoSalario(percent);
			
		} else
			System.out.println("Esse ID não existe");

		System.out.println("Lista de empregados: ");
		for (int i = 0; i < n; i++) {
			System.out.println(list.get(i));
		}

		sc.close();
	}

	public static void help() {
		List<String> list = new ArrayList<>(); // Parametrizando Lista de inteiros com wrapper class

		list.add("Maria");
		list.add("Bob");
		list.add("Alex");
		list.add("Camila");
		list.add("Paul");
		list.add(0, "Herick");

		System.out.println(list.size());

		for (String obj : list) {
			System.out.println(obj);
		}

		System.out.println("------------------------");

		// list.remove(1);
		// list.removeIf(obj -> obj.charAt(0) == 'H');

		for (String obj : list) {
			System.out.println(obj);
		}

		System.out.println("------------------------");
		System.out.println("Index: " + list.indexOf("Paul"));

		System.out.println("------------------------");
		List<String> result = list.stream().filter(obj -> obj.charAt((obj.length() - 1)) == 'a')
				.collect(Collectors.toList());

		for (String obj : result) {
			System.out.println(obj);
		}

		String nome = list.stream().filter(obj -> obj.charAt((obj.length() - 1)) == 'a').findFirst().orElse(null);
		System.out.println(nome);
	}

	public static Integer hasID(List<Funcionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return -1;

	}
}
