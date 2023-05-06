package entity;

public class Cursos {
	private String nome;
	private String descricao;
	private String turno;
//=====================================================================================
	public Cursos(String nome, String descricao, String turno) {
		this.nome = nome;
		this.descricao = descricao;
		this.turno = turno;
	}
//=====================================================================================
	public final String getNome() {
		return nome;
	}
	public final void setNome(String nome) {
		this.nome = nome;
	}
	public final String getDescricao() {
		return descricao;
	}
	public final void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public final String getTurno() {
		return turno;
	}
	public final void setTurno(String turno) {
		this.turno = turno;
	}
}
