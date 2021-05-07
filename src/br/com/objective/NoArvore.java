package br.com.objective;

import br.com.objective.comuns.TextosDialog;

public class NoArvore extends No {

	private No opcaoSim;
	private No opcaoNao;

	public NoArvore(String dado) {
		super(dado);
	}

	@Override
	public void perguntar() {
		int resultadoDialog = TextosDialog.aComidaQueVocePensouEh(this.getDado());

		if (resultadoDialog == -1)
			Main.sairDoJogo();
		else {
			if (resultadoDialog == 0)
				this.opcaoSim.perguntar();
			else
				this.opcaoNao.perguntar();
		}
	}

	public No getOpcaoSim() {
		return opcaoSim;
	}

	public void setOpcaoSim(No opcaoSim) {
		this.opcaoSim = opcaoSim;
	}

	public No getOpcaoNao() {
		return opcaoNao;
	}

	public void setOpcaoNao(No opcaoNao) {
		this.opcaoNao = opcaoNao;
	}

}
