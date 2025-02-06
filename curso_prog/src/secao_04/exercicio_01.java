package secao_04;
import java.lang.Math;
import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Exercicio_01();
		// Exercicio_02();
		// Exercicio_03();
		// Exercicio_04();
		// Exercicio_05();
		// Exercicio_06();

	}

	public static void Exercicio_01() {

		/*
		 * Exercício 01: Faça um programa para ler dois valores inteiros, e depois
		 * mostrar na tela a soma desses números com uma mensagem explicativa, conforme
		 * exemplos.
		 */

		Scanner sc = new Scanner(System.in);
		int valor1, valor2;
		System.out.print("Digite o primeiro valor: ");
		valor1 = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		valor2 = sc.nextInt();

		int resultado = valor1 + valor2;

		System.out.printf("O valor da soma é: %d + %d = %d", valor1, valor2, resultado);
		sc.close();

	}

	public static void Exercicio_02() {
		/*
		 * Exercício 02: Faça um programa para ler o valor do raio de um círculo, e
		 * depois mostrar o valor da área deste círculo com quatro casas decimais
		 * conforme exemplos.
		 * 
		 * Fórmula da área: area = π . raio2 
		 * Considere o valor de π = 3.14159
		 */

		Scanner sc = new Scanner(System.in);
		double raio, area;
		System.out.print("Digite o valor do raio: ");
		raio = sc.nextDouble();
		area = Math.PI * Math.pow(raio, 2.0);
		System.out.printf("O valor da área deste círculo é de: %.4f", area);
		sc.close();
		
	}

	public static void Exercicio_03() {
		/*
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
		 * segundo a fórmula: DIFERENCA = (A * B - C * D).
		 */
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, result;
		
		System.out.println("Digite quatro valores inteiros a seguir: ");
		System.out.print("A: ");
		A = sc.nextInt();
		System.out.print("B: ");
		B = sc.nextInt();
		System.out.print("C: ");
		C = sc.nextInt();
		System.out.print("D: ");
		D = sc.nextInt();
		
		result = (A*B-C*D); 
				
		System.out.printf("O resultado é: %d", result);
		
		sc.close();
	}

	public static void Exercicio_04() {
		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */
		
		Scanner sc = new Scanner(System.in);
		int numFunc, hrsTrabal;
		double valHora, salario;
		
		System.out.print("Digite o seu número de funcionário: ");
		numFunc = sc.nextInt();
		System.out.print("Digite o número de horas trabalhadas: ");
		hrsTrabal = sc.nextInt();
		System.out.print("Digite o valor que recebe por horas trabalhadas: ");
		valHora= sc.nextDouble();
		
		salario = valHora * hrsTrabal;
		
		System.out.printf("Número: %d%nSalário: %.2f", numFunc, salario);
		
		sc.close();
	}

	public static void Exercicio_05() {
		/*
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, numPeca1, codPeca2, numPeca2;
		double valUniPeca1, valTotalPeca1, valUniPeca2, valTotalPeca2, valTotalCompra;
		
		System.out.print("Código da Peça 1: ");
		codPeca1 = sc.nextInt();
		System.out.print("Quantidade de Peça 1: ");
		numPeca1 = sc.nextInt();
		System.out.print("Valor da Peça 1: ");
		valUniPeca1 = sc.nextDouble();
		
		System.out.print("Código da Peça 2: ");
		codPeca2 = sc.nextInt();
		System.out.print("Quantidade de Peça 2: ");
		numPeca2 = sc.nextInt();
		System.out.print("Valor da Peça 2: ");
		valUniPeca2 = sc.nextDouble();
		
		valTotalPeca1 = (double) numPeca1 * valUniPeca1;
		valTotalPeca2 = (double) numPeca2 * valUniPeca2;
		
		valTotalCompra = valTotalPeca1 + valTotalPeca2;
		
		System.out.printf("Total Peça 1 = R$%.2f%nTotal Peça 2 = R$%.2f%nTotal Compra = R$%.2f", valTotalPeca1, valTotalPeca2, valTotalCompra);
		
		sc.close();
	}

	public static void Exercicio_06() {

		/*
		 * Fazer um programa que leia três valores com ponto flutuante de dupla
		 * precisão: A, B e C. Em seguida, calcule e mostre: 
		 * a) a área do triângulo retângulo que tem A por base e C por altura. 
		 * b) a área do círculo de raio C. (pi = 3.14159) 
		 * c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B. 
		 * e) a área do retângulo que tem lados A e B.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		float A, B, C;
		float areaTriRet, areaCirc, areaTrap, areaQuad, areaRet;
		
		System.out.println("Insira os valores de A, B, C, respectivamente:");
		
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		
		areaTriRet = A*C/2f;
		areaCirc = (float) (Math.PI * Math.pow(C, 2f));
		areaTrap = ((A+B)/2f) * C;
		areaQuad = (float) Math.pow(B,2f);
		areaRet = A*B;
		
		System.out.printf("Area do Triangulo Retangulo: %.3f%n", areaTriRet);
		System.out.printf("Area do Circulo: %.3f%n", areaCirc);
		System.out.printf("Area do Trapézio: %.3f%n", areaTrap);
		System.out.printf("Area do Quadrado: %.3f%n", areaQuad);
		System.out.printf("Area do Retângulo: %.3f%n", areaRet);

		sc.close();
		
	}
}
