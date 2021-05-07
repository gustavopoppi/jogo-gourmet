package br.com.objective;

import br.com.objective.comuns.TextosDialog;

public class NoFolha extends No {

	private NoArvore pai;

	public NoFolha(NoArvore pai, String dado) {
		super(dado);
		this.pai = pai;
	}

	@Override
	public void perguntar() {
		int resultadoDialog = TextosDialog.aComidaQueVocePensouEh(this.getDado());

		if (resultadoDialog == -1)
			Main.sairDoJogo();
		else {
			if (resultadoDialog == 0)
				TextosDialog.acerteiDeNovo();
			else
				inserirNovoPrato();
		}
	}

	private void inserirNovoPrato() {
		String pratoPensado = TextosDialog.qualPratoVocePensou();
		String caracteristicaPratoPensado = TextosDialog.pratoPensadoEhPratoAntigoNao(pratoPensado, this.getDado());

		NoArvore novaCaracteristica = new NoArvore(caracteristicaPratoPensado);
		NoFolha novoPrato = new NoFolha(novaCaracteristica, pratoPensado);

		novaCaracteristica.setOpcaoSim(novoPrato);
		novaCaracteristica.setOpcaoNao(this);

		verificarSeTemPaiEInserirPai(this, novaCaracteristica);
	}

	private void verificarSeTemPaiEInserirPai(NoFolha noFolha, NoArvore novaCaracteristica) {
		NoArvore getPai = this.getPai();
		if (getPai.getOpcaoSim().equals(this))
			getPai.setOpcaoSim(novaCaracteristica);
		else
			getPai.setOpcaoNao(novaCaracteristica);

		this.setPai(novaCaracteristica);
	}

	public NoArvore getPai() {
		return pai;
	}

	public void setPai(NoArvore pai) {
		this.pai = pai;
	}

}
