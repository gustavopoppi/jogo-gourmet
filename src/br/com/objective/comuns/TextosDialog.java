package br.com.objective.comuns;

import static javax.swing.JOptionPane.DEFAULT_OPTION;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showInputDialog;

public abstract class TextosDialog {

	public static int aComidaQueVocePensouEh(String nomeComida) {
		return showConfirmDialog(null, "A comida que você pensou é " + nomeComida + "?", Contantes.TITULO_DIALOG,
				YES_NO_OPTION);
	}

	public static void acerteiDeNovo() {
		showConfirmDialog(null, "Acertei de novo!", Contantes.TITULO_DIALOG, DEFAULT_OPTION, INFORMATION_MESSAGE);
	}

	public static String qualPratoVocePensou() {
		return showInputDialog(Contantes.QUAL_PRATO_VOCE_PENSOU);
	}

	public static String pratoPensadoEhPratoAntigoNao(String pratoPensado, String pratoAntigo) {
		return showInputDialog(String.format(Contantes.PRATO_PENSADO_EH_PRATO_ANTIGO_NAO, pratoPensado, pratoAntigo));
	}

	public static int penseEmUmPratoQueVoceGoste() {
		return showConfirmDialog(null, "Pense em um prato que gosta", Contantes.TITULO_DIALOG, DEFAULT_OPTION,
				INFORMATION_MESSAGE);
	}
}
