package application;

import java.util.Scanner;

import entities.Notas;

public class Program_Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Notas estudante = new Notas();
		
		System.out.print("Insira seu nome: ");
		estudante.nome = sc.next();
		System.out.print("Insira a nota do primeiro trimestre: ");
		estudante.nota1 = sc.nextDouble();
		System.out.print("Insira a nota do segundo trimestre: ");
		estudante.nota2 = sc.nextDouble();
		System.out.print("Insira a nota do terceiro trimestre: ");
		estudante.nota3 = sc.nextDouble();
						
		System.out.println(estudante);
		
		sc.close();
	}

}
