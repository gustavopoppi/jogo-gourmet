package br.com.objective;

public abstract class No {

	private String dado;

	public No(String dado) {
		this.dado = dado;
	}

	public abstract void perguntar();

	public String getDado() {
		return dado;
	}

	public void setDado(String dado) {
		this.dado = dado;
	}
}
