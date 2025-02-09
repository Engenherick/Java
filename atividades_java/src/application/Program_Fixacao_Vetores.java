package application;

import java.util.Scanner;
import entities.Alturas;
import entities.Aprovados;
import entities.DadosPessoas;

public class Program_Fixacao_Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mais_velho();
	}

	public static void Negativo() {
		/*
		 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois
		 * N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela
		 * todos os números negativos lidos.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar?");
		int n = sc.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		System.out.println("Números negativos: ");

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.printf("%d%n", vect[i]);
			}
		}

		sc.close();
	}

	public static void soma_vetor() {

		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a
		 * média dos elementos do vetor
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		double[] vect = new double[n];
		double sum = 0.0;

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}

		System.out.print("Valores Digitados: ");

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);

		}

		System.out.println("\nSoma: " + sum);
		System.out.println("Média: " + sum / vect.length);

		sc.close();
	}

	public static void alturas() {
		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
		 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também
		 * a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
		 * pessoas caso houver.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();

		Alturas[] pessoa = new Alturas[n];

		for (int i = 0; i < pessoa.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			pessoa[i] = new Alturas(nome, idade, altura);
		}

		double soma = 0.0;
		int qtdMenores = 0;

		for (int i = 0; i < pessoa.length; i++) {
			soma += pessoa[i].getAltura(); // soma das alturas de cada pessoa;
			qtdMenores += (pessoa[i].getIdade() < 16) ? 1 : 0;
		}

		double percent = ((double) qtdMenores / pessoa.length) * 100.0;

		System.out.printf("Altura média: %.2f%n", soma / pessoa.length);
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", percent);

		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getNome());
			}
		}

		sc.close();

	}

	public static void pares() {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		System.out.println("");
		System.out.println("");
		System.out.println("Números Pares: ");
		int qtdPar = 0;

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d ", vect[i]);
				qtdPar += 1;
			}
		}

		System.out.println("");
		System.out.println("");
		System.out.println("Quantidade de números pares: " + qtdPar);

		sc.close();
	}

	public static void maior_pos() {
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida, mostrar na tela o maior número do vetor (supor não haver empates).
		 * Mostrar também a posição do maior elemento, considerando a primeira posição
		 * como 0 (zero).
		 */

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}

		double maiorValor = 0.0;
		int posMaiorValor = 0;

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > maiorValor) {
				maiorValor = vect[i];
				posMaiorValor = i;
			}
		}

		System.out.printf("Maior Valor: %.2f%n", maiorValor);
		System.out.printf("Posição do Maior Valor: %d", posMaiorValor);

		sc.close();
	}

	public static void soma_vetores() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores cada vetor terá? ");

		int n = sc.nextInt();

		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectRes = new int[n];

		System.out.println("Digite os valores do Vetor A:");
		for (int i = 0; i < vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do Vetor B:");
		for (int i = 0; i < vectB.length; i++) {
			vectB[i] = sc.nextInt();
		}

		System.out.println("Vetor Resultante:");
		for (int i = 0; i < vectRes.length; i++) {
			vectRes[i] = vectA[i] + vectB[i];
			System.out.println(vectRes[i]);
		}

		sc.close();
	}

	public static void abaixo_media() {
		/*
		 * Fazer um programa para ler um número inteiro N e depois um vetor de N números
		 * reais. Em seguida, mostrar na tela a média aritmética de todos elementos com
		 * três casas decimais. Depois mostrar todos os elementos do vetor que estejam
		 * abaixo da média, com uma casa decimal cada.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de números a serem lidos: ");
		int n = sc.nextInt();

		double[] vect = new double[n];
		double sum = 0.0;

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}

		double media = sum / vect.length;

		System.out.printf("Média Aritmética: %.3f%n", media);
		System.out.println("Elementos abaixo da média:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < media) {
				System.out.printf("%.1f%n", vect[i]);
			}
		}

		sc.close();
	}

	public static void media_pares() {
		/*
		 * Fazer um programa para ler um vetor de N números inteiros. Em seguida,
		 * mostrar na tela a média aritmética somente dos números pares lidos, com uma
		 * casa decimal. Se nenhum número par for digitado, mostrar a mensagem
		 * "NENHUM NUMERO PAR"
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira a quantidade de leituras: ");
		int n = sc.nextInt();

		int[] vect = new int[n];
		int sumPar = 0, qtdPar = 0;

		for (int i = 0; i < vect.length; i++) {
			System.out.print("\nDigite um número: ");
			vect[i] = sc.nextInt();
			if (vect[i] % 2 == 0) {
				sumPar += vect[i];
				qtdPar += 1;
			}
		}

		System.out.println();

		if (qtdPar == 0) {
			System.out.println("Nenhum número par");
		} else {
			double media = sumPar / qtdPar;
			System.out.printf("Média aritmetica dos pares: %.1f%n", media);
		}

		sc.close();

	}

	public static void mais_velho() {
		/*
		 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas
		 * idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro
		 * vetor. Depois, mostrar na tela o nome da pessoa mais velha.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar?");
		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		int maiorIdade = 0, indexMaiorIdade = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();

			if (idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				indexMaiorIdade = i;
			}
		}
		System.out.println("Pessoa mais velha: " + nome[indexMaiorIdade]);
		sc.close();
	}

	public static void aprovados() {
		/*
		 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as
		 * notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve
		 * ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
		 * considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0
		 * (seis).
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão inseridos? ");

		int n = sc.nextInt();

		Aprovados[] alunos = new Aprovados[n];

		for (int i = 0; i < alunos.length; i++) {
			System.out.print("Digite o nome do aluno: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.printf("Digite a primeira nota de %s", nome);
			double nota1 = sc.nextDouble();

			System.out.printf("Digite a segunda nota de %s", nome);
			double nota2 = sc.nextDouble();

			alunos[i] = new Aprovados(nome, nota1, nota2);

		}
		System.out.println("Alunos Aprovados: ");
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i].mediaFinal() >= 6.0) {
				System.out.println(alunos[i].getNome());
			}

		}
		sc.close();
	}

	public static void dados_pessoas() {
		/*
		 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
		 * Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a
		 * média de altura das mulheres, e o número de homens.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão inseridas? ");
		int n = sc.nextInt();

		DadosPessoas[] usuario = new DadosPessoas[n];

		for (int i = 0; i < usuario.length; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			double altura = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			char genero = sc.next().charAt(0);

			usuario[i] = new DadosPessoas(altura, genero);
		}

		double maiorAltura = 0.0, menorAltura = usuario[0].getAltura(), somaAltMulheres = 0.0;
		int qtdHomens = 0, qtdMulher = 0;

		for (int i = 0; i < usuario.length; i++) {
			if (usuario[i].getAltura() > maiorAltura) {
				maiorAltura = usuario[i].getAltura();
			} else if (usuario[i].getAltura() < menorAltura) {
				menorAltura = usuario[i].getAltura();
			}

			if (usuario[i].getGenero() == 'F') {
				somaAltMulheres += usuario[i].getAltura();
				qtdMulher += 1;
			} else if (usuario[i].getGenero() == 'M') {
				qtdHomens += 1;
			}
		}

		double mediaAltMulheres = somaAltMulheres / qtdMulher;

		System.out.println("Maior Altura: " + maiorAltura);
		System.out.println("Menor Altura: " + menorAltura);
		System.out.printf("Média Altura das Mulheres: %.2f%n" + mediaAltMulheres);
		System.out.println("Quantidade de homens: " + qtdHomens);

		sc.close();

	}

}