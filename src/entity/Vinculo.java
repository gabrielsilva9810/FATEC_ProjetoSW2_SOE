package entity;

public class Vinculo {
	private String termoCompromisso;
//=====================================================================================
	public Vinculo(String termoCompromisso) {
		this.termoCompromisso = termoCompromisso;
	}
//=====================================================================================
	public final String getTermoCompromisso() {
		return termoCompromisso;
	}

	public final void setTermoCompromisso(String termoCompromisso) {
		this.termoCompromisso = termoCompromisso;
	}
}
