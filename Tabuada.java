package br.com.tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v1;
		int v2;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o 1° valor: ");
		v1 = entrada.nextInt();
		System.out.println("Digite o 2° valor: ");
		v2 = entrada.nextInt();
		
		for (int i = 0; i <= v2 ; i++) {
			System.out.println(v1 + " X " + i + " = " + (v1 * i));
			
		}

	
	}

}