package br.com.objective.comuns;

import static javax.swing.JOptionPane.DEFAULT_OPTION;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showInputDialog;

public abstract class TextosDialog {

	public static int aComidaQueVocePensouEh(String nomeComida) {
		return showConfirmDialog(null, String.format(Constantes.O_PRATO_QUE_VOCE_PENSOU_EH, nomeComida), "Confirm",
				YES_NO_OPTION);
	}

	public static void acerteiDeNovo() {
		showConfirmDialog(null, "Acertei de novo!", Constantes.TITULO_DIALOG, DEFAULT_OPTION, INFORMATION_MESSAGE);
	}

	public static int penseEmUmPratoQueVoceGosta() {
		return showConfirmDialog(null, "Pense em um prato que gosta", Constantes.TITULO_DIALOG, DEFAULT_OPTION,
				INFORMATION_MESSAGE);
	}
	
	public static String qualPratoVocePensou() {
		return showInputDialog(null, Constantes.QUAL_PRATO_VOCE_PENSOU, "Desisto", QUESTION_MESSAGE);
	}

	public static String pratoPensadoEhPratoAntigoNao(String pratoPensado, String pratoAntigo) {
		return showInputDialog(null, String.format(Constantes.PRATO_PENSADO_EH_PRATO_ANTIGO_NAO, pratoPensado, pratoAntigo),"Complete", QUESTION_MESSAGE);
	}

}
