package secao_04;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int valorFatorial;
		System.out.println("Qual o valor que você deseja aplicar o fatorial? (Apenas números inteiros)");
		valorFatorial = sc.nextInt();
		sc.close();

		int i, resultado = 1;
		for(i = 1; i <= valorFatorial; i++) {
			resultado = resultado*i;
		}
		
		System.out.printf("O resultado de %d! é: %d", valorFatorial, resultado);
		
	}

}