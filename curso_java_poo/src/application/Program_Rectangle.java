package application;

import java.util.Scanner;
import entities.Rectangle;

public class Program_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fazer um programa para ler os valores da largura e altura de um retangul.
		 * Em seguida mostrar na tela o valor de sua área, perímetro e diagonal.
		 * Usar uma classe como mostrado no projeto ao lado
		 * */
	
		Scanner sc = new Scanner(System.in);
		
		Rectangle retangulo = new Rectangle();
		
		System.out.println("Insira o valor da Largura: ");
		retangulo.largura = sc.nextDouble();
				
		System.out.println("Insira o valor da Altura: ");
		retangulo.altura = sc.nextDouble();
		
		System.out.println(retangulo);
		
		sc.close();
	}

}
