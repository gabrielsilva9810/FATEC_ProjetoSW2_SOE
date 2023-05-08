package entity;

public class Vinculo {
	private IGrupos grupo;
	private IOrientador orientador;
	private String termoCompromisso;
//=====================================================================================
	public Vinculo() {
		
	}
	public Vinculo(IGrupos grupo, IOrientador orientador, String termoCompromisso) {
		this.grupo = grupo;
		this.orientador = orientador;
		this.termoCompromisso = termoCompromisso;
	}
//=====================================================================================
	public final IGrupos getGrupo() {
		return grupo;
	}

	public final void setGrupo(IGrupos grupo) {
		this.grupo = grupo;
	}

	public final IOrientador getOrientador() {
		return orientador;
	}

	public final void setOrientador(IOrientador orientador) {
		this.orientador = orientador;
	}

	public final String getTermoCompromisso() {
		return termoCompromisso;
	}

	public final void setTermoCompromisso(String termoCompromisso) {
		this.termoCompromisso = termoCompromisso;
	}

}
