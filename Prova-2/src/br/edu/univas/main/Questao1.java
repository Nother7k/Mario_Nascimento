package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int contador = 0, leitura;

		System.out.println("Por favor, digite os números, quando desejar encerrar o programa digite 0");

		while (true) {
			leitura = Scanner.nextInt();
			if (leitura < 0) {
				contador++;
			} else if (leitura == 0) {
				break;
			}
		}
		System.out.println("Foram digitados " + contador + " números negativos");
	}

}
