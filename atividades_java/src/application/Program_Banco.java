package application;

import java.util.Scanner;

import entities.Banco;

public class Program_Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc = 0;
		
		Banco cadastro;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira seu nome: ");
		String name = sc.next();
		System.out.print("Insira o número da conta: ");
		int numConta = sc.nextInt();
		System.out.print("Deseja fazer primeiro depósito? S/N");
		char primDep = sc.next().charAt(0);
				
		if (primDep == 'S') {
			System.out.print("Insira o valor para depósito: ");
			double initDep = sc.nextDouble();
			cadastro = new Banco(numConta, name, initDep);
		} else { 
			cadastro = new Banco(numConta, name);
			}
		
		System.out.println("\n" + cadastro);
		
		do {
		System.out.println("O que deseja fazer?");
		System.out.println("1. Depósito");
		System.out.println("2. Saque");
		System.out.println("3. Alterar Nome");
		System.out.println("4. Sair");
		
		opc = sc.nextInt();
		
		if(opc == 1) {
			
		System.out.print("Digite um valor para depósito: ");
		cadastro.deposito(sc.nextDouble());
		System.out.print(cadastro);
		
		}else if(opc == 2) {
			
		System.out.print("Digite um valor para saque (Taxa de R$5,00: ");
		cadastro.saque(sc.nextDouble());
		System.out.print(cadastro);
		
		}else if(opc == 3) {
			System.out.printf("Nome atual: %s", cadastro.getNome());
			System.out.print("Digite oo novo nome: ");
			cadastro.setNome(sc.next());			
		}
		
		}while(opc != 4);
		
		sc.close();
	}

}
