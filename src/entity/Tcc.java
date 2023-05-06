package entity;

public class Tcc {
	private String tema;
	private String justificativa;
//=====================================================================================
	public Tcc(String tema, String justificativa) {
		this.tema = tema;
		this.justificativa = justificativa;
	}
//=====================================================================================
	public final String getTema() {
		return tema;
	}
	public final void setTema(String tema) {
		this.tema = tema;
	}
	public final String getJustificativa() {
		return justificativa;
	}
	public final void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
}
