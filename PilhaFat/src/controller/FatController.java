package controller;

import esmagalhaes.pilhaInt.PilhaInt;

public class FatController {
	private PilhaInt pilha;

	public FatController() {
		pilha = new PilhaInt();
	}

	public int Pilhar(int valor) {

		for (int i = valor; i > 0; i--) {
			pilha.push(i);
		}

		int fat = 1;

		while (!pilha.isEmpty()) {
			try {
				fat *= pilha.pop();
			} catch (Exception e) {
				System.err.println("Erro ao desempilhar: " + e.getMessage());
			}
		}
		return fat;
	}
}