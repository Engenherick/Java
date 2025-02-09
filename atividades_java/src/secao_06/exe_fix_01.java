package secao_06;

import java.util.Scanner;

public class exe_fix_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exe_06();
	}

	public static void exe_01() {
		// TODO Auto-generated method stub
		/*
		 * Escreva um programa que repita a leitura de uma senha até que ela seja
		 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
		 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 * correta é o valor 2002.
		 */

		Scanner sc = new Scanner(System.in);
		int senha = sc.nextInt();
		int senhaCorreta = 2002;

		while (senha != senhaCorreta) {
			System.out.println("Senha Invalida...");
			senha = sc.nextInt();
		}

		System.out.println("Acesso Permitido");
		sc.close();

	}

	public static void exe_02() {
		// TODO Auto-generated method stub
		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		 * alguma)
		 */

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();

		do {
			if (x > 0) {
				if (y > 0) {
					System.out.println("Primeiro Quadrante");
				} else if (y < 0) {
					System.out.println("Quarto Quadrante");
				}
			}
			if (x < 0) {
				if (y > 0) {
					System.out.println("Segundo Quadrante");
				} else if (y < 0) {
					System.out.println("Terceiro Quadrante");
				}
			}
			x = sc.nextInt();
			y = sc.nextInt();
		} while (x * y != 0);
		sc.close();

	}

	public static void exe_03() {
		// TODO Auto-generated method stub
		/*
		 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
		 * será encerrado quando o código informado for o número 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combustível, conforme exemplo.
		 */

		Scanner sc = new Scanner(System.in);

		int totGas = 0, totAlc = 0, totDies = 0;

		System.out.println("Informe o tipo de combustível:");
		System.out.println("1. Alcool");
		System.out.println("2. Gasolina");
		System.out.println("3. Diesel");
		System.out.println("4. Fim");

		int selecao = sc.nextInt();

		while (selecao != 4) {
			switch (selecao) {
			case 1:
				totAlc += 1;
				break;
			case 2:
				totGas += 1;
				break;
			case 3:
				totDies += 1;
				break;
			default:
				break;
			}
			selecao = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d%n", totAlc, totGas, totDies);

		sc.close();
	}

	public static void exe_04() {
		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
		 * até X, um valor por linha, inclusive o X, se for o caso.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um valor entre 1 e 1000: ");
		int valor = sc.nextInt();

		while (valor > 1000 || valor <= 0) {
			System.out.print("Informe um valor entre 1 e 1000: ");
			valor = sc.nextInt();
		}

		for (int i = 1; i <= valor; i++) {
			System.out.print((i % 2 == 1) ? i + "\n" : "");
		}

		sc.close();

	}

	public static void exe_05() {
		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
		 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
		 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
		 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
		 * "out" para fora do intervalo).
		 */

		Scanner sc = new Scanner(System.in);

		int in = 0, out = 0, qtd = sc.nextInt();
		int valor;

		for (int i = 1; i <= qtd; i++) {
			valor = sc.nextInt();
			if (valor >= 10 && valor <= 20) {
				in += 1;
			} else
				out += 1;
		}

		System.out.println("In: " + in + "\n" + "Out: " + out);

		sc.close();
	}

	public static void exe_06() {
		/*
		 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
		 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
		 * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
		 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
		 * o terceiro valor tem peso 5.
		 */

		Scanner sc = new Scanner(System.in);

		int qtdTeste = sc.nextInt();
		double valor1, valor2, valor3;
		double peso1 = 2.0, peso2 = 3.0, peso3 = 5.0, resultado;

		for (int i = 1; i <= qtdTeste; i++) {
			System.out.println("Iteração: " + i + "/" + qtdTeste);
			System.out.println("Insira os 3 valores: ");
			valor1 = sc.nextDouble();
			valor2 = sc.nextDouble();
			valor3 = sc.nextDouble();

			resultado = ((valor1 * peso1) + (valor2 * peso2) + (valor3 * peso3)) / (peso1 + peso2 + peso3);
			System.out.printf("A média ponderada é: %.1f", resultado);
		}

		sc.close();

	}

	public static void exe_07() {
		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números e
		 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
		 * mostrar a mensagem "divisao impossivel".
		 */

		Scanner sc = new Scanner(System.in);

		int rep = sc.nextInt();

		for (int i = 1; i <= rep; i++) {
			float a = sc.nextFloat(), b = sc.nextFloat();
			if (b == 0) {
				System.out.println("Divisão impossível");
			} else
				System.out.println(a / b);
		}

		sc.close();

	}

	public static void exe_08() {

		Scanner sc = new Scanner(System.in);
		int valorFatorial;

		System.out.println("Qual o valor que você deseja aplicar o fatorial? (Apenas números inteiros)");

		valorFatorial = sc.nextInt();
		sc.close();

		int i, resultado = 1;
		for (i = 1; i <= valorFatorial; i++) {
			resultado = resultado * i;
		}

		System.out.printf("O resultado de %d! é: %d", valorFatorial, resultado);
	}

	public static void exe_09() {
		/* Ler um número inteiro N e calcular todos os seus divisores. */

		Scanner sc = new Scanner(System.in);

		int valor = sc.nextInt();

		for (int i = 1; i <= valor; i++) {
			if (valor % i == 0)
				System.out.println(i);
		}

		sc.close();
	}

	public static void exe_10() {
		/*
		 * Fazer um programa para ler um número inteiro positivo N. O programa deve
		 * então mostrar na tela N linhas, começando de 1 até N. Para cada linha,
		 * mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
		 * exemplo
		 */

		Scanner sc = new Scanner(System.in);

		int valor = sc.nextInt();

		for (int i = 1; i <= valor; i++) {
			System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));

		}
		sc.close();

	}
}
