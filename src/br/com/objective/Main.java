package br.com.objective;

import br.com.objective.comuns.TextosDialog;

public class Main {

	public static int sairJogo = 0;

	public static void main(String[] args) {
		configurarJogo();
	}

	private static void configurarJogo() {

		if (TextosDialog.penseEmUmPratoQueVoceGoste() == -1)
			sairDoJogo();

		inserirArvoreInicial();
	}

	private static void inserirArvoreInicial() {
		NoArvore raiz = new NoArvore("massa");
		NoFolha folha = new NoFolha(raiz, "lasanha");

		NoFolha boloChocolate = new NoFolha(raiz, "Bolo de Chocolate");

		raiz.setOpcaoSim(folha);
		raiz.setOpcaoNao(boloChocolate);

		iniciarJogo(raiz);
	}

	protected static void iniciarJogo(NoArvore raiz) {
		while (sairJogo != -1) {
			raiz.perguntar();
		}
	}

	public static void sairDoJogo() {
		Main.sairJogo = -1;
	}
}
