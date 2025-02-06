package secao_05;

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exe_02();
	}

	public static void exe_01() {

		/*
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
		 * negativo ou não.
		 */

		Scanner sc = new Scanner(System.in);
		int numero;
		numero = sc.nextInt();

		String teste = (numero >= 0) ? "O numéro é NAO NEGATIVO" : "O numéro é NEGATIVO";
		System.out.println(teste);

		sc.close();
	}

	public static void exe_02() {
		/*
		 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
		 * ímpar.
		 */

		Scanner sc = new Scanner(System.in);

		int numero;
		numero = sc.nextInt();

		String ret = (numero % 2 == 0) ? "Número Par" : "Número Impar";

		System.out.println(ret);

		sc.close();

	}

	public static void exe_03() {
		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
		 * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
		 * crescente ou decrescente
		 */

		Scanner sc = new Scanner(System.in);

		int valA = sc.nextInt(), valB = sc.nextInt();

		String res = (valA > valB) ? (valA % valB == 0) ? "São Múltiplos" : "Não são múltiplos"
				: (valB % valA == 0) ? "São Múltiplos" : "Não são múltiplos";

		System.out.println(res);
		sc.close();
	}

	public static void exe_04() {
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
		 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
		 * uma duração mínima de 1 hora e máxima de 24 horas.
		 */

		Scanner sc = new Scanner(System.in);

		int horaIni = sc.nextInt(), horaFim = sc.nextInt();
		horaFim = (horaFim == 0) ? 24 : horaFim;
		int duracao = (horaFim < horaIni) ? horaFim - horaIni + 24 : horaFim - horaIni;

		System.out.printf("O jogo teve duração de: %d", duracao, "horas");

		sc.close();

	}

	public static void exe_05() {
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
		 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		 * 
		 * 1 Cachorro Quente R$4,00 2 X-Salada R$4,50 3 X-Bacon R$5,00 4 Torrada Simples
		 * R$2,00 5 Refrigerante R$1,50
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o produto que você deseja:");
		System.out.println("1 | Cachorro Quente | R$4,00");
		System.out.println("2 | X-Salada        | R$4,50");
		System.out.println("3 | X-Bacon         | R$5,00");
		System.out.println("4 | Torrada Simples | R$2,00");
		System.out.println("5 | Refrigerante    | R$1,50");

		int produto = sc.nextInt();

		System.out.print("Digite a quantidade que você deseja: ");
		int qtdProduto = sc.nextInt();
		float valTotal = 0;

		switch (produto) {
		case 1:
			valTotal = qtdProduto * 4;
			break;
		case 2:
			valTotal = qtdProduto * 4.5f;
			break;
		case 3:
			valTotal = qtdProduto * 5;
			break;
		case 4:
			valTotal = qtdProduto * 2;
			break;
		case 5:
			valTotal = qtdProduto * 1.5f;
			break;
		default:
			break;
		}
		
		System.out.printf("O valor total da sua compra foi de: R$%.2f", valTotal);

		sc.close();

	}

	public static void exe_06() {
		/*
		 * Você deve fazer um programa que leia um valor qualquer e apresente uma
		 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75],
		 * (75,100]) este valor se encontra.
		 * 
		 * Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser
		 * impressa a mensagem “Fora de intervalo”.
		 */

		Scanner sc = new Scanner(System.in);

		float valor = sc.nextFloat();

		if (valor >= 0 && valor <= 25) {
			System.out.println("O valor se encontra no intervalo [0,25]");
		} else if (valor > 25 && valor <= 50) {
			System.out.println("O valor se encontra no intervalo (25,50]");
		} else if (valor > 50 && valor <= 75) {
			System.out.println("O valor se encontra no intervalo (50,75]");
		} else if (valor > 75 && valor <= 100) {
			System.out.println("O valor se encontra no intervalo (75,100]");
		} else
			System.out.println("Fora de intervalo");

		sc.close();

	}

	public static void exe_07() {
		/*
		 * Leia 2 valores com uma casa decimal (x e y), que devem representar as
		 * coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao
		 * qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem
		 * (x = y = 0).
		 * 
		 * Se o ponto estiver na origem, escreva a mensagem “Origem”.
		 * 
		 * Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme
		 * for a situação.
		 */

		Scanner sc = new Scanner(System.in);

		float x = sc.nextFloat(), y = sc.nextFloat();

		if (x > 0) {
			if (y > 0) {
				System.out.println("o ponto está no 1º Quadrante");
			} else if (y == 0) {
				System.out.println("O ponto está sobre o Eixo Y");
			} else {
				System.out.println("O ponto está no 4º Quadrante");
			}
		} else if (x < 0) {
			if (y > 0) {
				System.out.println("O ponto está no 2º Quadrante");
			} else if (y == 0) {
				System.out.println("O ponto está sobre o Eixo Y");
			} else {
				System.out.println("O ponto está no 3º Quadrante");
			}
		} else {
			if (y != 0) {
				System.out.println("O ponto está sobre o Eixo X");
			} else if (y == 0) {
				System.out.println("O ponto está na origem");
			}
		}
		sc.close();
	}

	public static void exe_08() {
		/*
		 * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em
		 * pagar seus impostos, pois sabem que nele não existem políticos corruptos e os
		 * recursos arrecadados são utilizados em benefício da população, sem qualquer
		 * desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
		 * 
		 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa
		 * de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de
		 * Imposto de Renda, segundo a tabela abaixo.
		 * 
		 * 0 a 2000 - Isento 2000,01 até 3000,00 - 8% 3000,01 até 4500,00 - 18% Acima de
		 * 4500 - 28%
		 * 
		 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas
		 * sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00
		 * é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8%
		 * sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O
		 * valor deve ser impresso com duas casas decimais.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o seu salário: ");
		float salario = sc.nextFloat(), impRenda = 0;

		if (salario > 0 && salario <= 2000) {
			impRenda = 0;
		} else if (salario > 2000 && salario <= 3000) {
			impRenda = (salario - 2000) * 0.08f;
		} else if (salario > 3000 && salario <= 4500) {
			impRenda = 80 + ((salario - 3000) * 0.18f);
		} else if (salario > 4500) {
			impRenda = 350 + (salario - 4500) * 0.28f;
		}

		System.out.printf("O imposto de renda é de: R$%.2f", impRenda);

		sc.close();
	}
}