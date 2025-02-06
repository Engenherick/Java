package secao_05;

import java.util.Scanner;

public class exe_fix_01 {

	public static void main(String[] args) {

		/*exe_01();
		exe_02();*/
	}

	public static void exe_01() {
		/*
		 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito
		 * a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos
		 * custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma
		 * pessoa consumiu, daí mostrar o valor a ser pago.
		 */

		Scanner sc = new Scanner(System.in);

		int tempoUsado;
		double valorPlano = 50.0;

		System.out.println("Insira a quantidade de minutos utilizados: ");
		tempoUsado = sc.nextInt();

		if (tempoUsado > 100) {
			valorPlano += (tempoUsado - 100.0) * 2.0;
		}

		System.out.printf("O valor da sua fatura é de: %.2f", valorPlano);

		sc.close();

	}

	public static void exe_02() {
		/*
		 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da
		 * semana (sendo 1=domingo, 2=segunda, e assim por diante). Escrever na tela o
		 * dia da semana correspondente, conforme exemplos.
		 */
		Scanner sc = new Scanner(System.in);
		int diaSemana;

		System.out.print("Digite o dia da semana que deseja: ");
		diaSemana = sc.nextInt();

		switch (diaSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			break;
		}

		sc.close();

	}
}