package br.edu.univas.main;

import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int numero = 0;

		System.out.println("Digite um numero");
		numero = Scanner.nextInt();
		if(numero % 5 == 4) {
			numero = numero + 1;
		} else if(numero % 5 == 3) {
			numero = numero + 2;

		}

		System.out.println(numero);
	}
}