package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int vSim = 0, vNao = 0, Sul = 0, Sud = 0, CeO = 0, Nort = 0, Nord = 0, leitura = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("Bem vindo à pesquisa");
			System.out.println("Você acredita que a vacina contra o COVID-19 fique pronta ainda em 2020?");
			System.out.println("Responda 1 para Sim e 2 para Não");
			leitura = Scanner.nextInt();
			if (leitura == 1) {
				vSim++;
				System.out.println("Você votou Sim!");
			} else if (leitura == 2) {
				vNao++;
				System.out.println("Você votou Não!");
			}
			System.out.println("Qual região do Brasil você mora?");
			System.out.println(
					"Responda 1 para Sul, 2 para Sudeste, 3 para Centro-Oeste, 4 para Norte e 5 para Nordeste");
			leitura = Scanner.nextInt();
			if (leitura == 1) {
				Sul++;
				System.out.println("Você votou Sul");
			} else if (leitura == 2) {
				Sud++;
				System.out.println("Você votou Sudeste");
			} else if (leitura == 3) {
				CeO++;
				System.out.println("Você votou Centro-Oeste");
			} else if (leitura == 4) {
				Nort++;
				System.out.println("Você votou Norte");
			} else {
				Nord++;
				System.out.println("Você votou Nordeste");
			}
			System.out.println("Muito obrigado por ter participado desta pesquisa!");
			System.out.println("====================================================");

		}
		System.out.println("Resultados da pesquisa: ");
		System.out.println(" ");
		System.out.println("Pergunta: ");
		System.out.println("Você acredita que a vacina contra o COVID-19 fique pronta ainda em 2020?");
		System.out.println("Resultados: ");
		System.out.println("Votaram Sim: " + vSim);
		System.out.println("Votaram Não: " + vNao);
		System.out.println(" ");
		System.out.println("Pergunta: ");
		System.out.println("Qual região do Brasil você mora?");
		System.out.println("Resultados: ");
		System.out.println("Votaram Sul: " + Sul);
		System.out.println("Votaram Sudeste: " + Sud);
		System.out.println("Votaram Centro-Oeste: " + CeO);
		System.out.println("Votaram Norte: " + Nort);
		System.out.println("Votaram Nordeste: " + Nord);
	}
}
