package entity;

import java.util.List;

public class Grupos {
	int idGrupo;
	List<IAluno> membros;
	int numMembros;
	ITcc tcc;
//=====================================================================================
	public Grupos() {
		
	}
	public Grupos(int idGrupo, List<IAluno> membros, int numMembros, ITcc tcc) {
		this.idGrupo = idGrupo;
		this.membros = membros;
		this.numMembros = numMembros;
		this.tcc = tcc;
	}
//=====================================================================================
	public final int getIdGrupo() {
		return idGrupo;
	}
	public final void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public final List<IAluno> getMembros() {
		return membros;
	}
	public final void setMembros(List<IAluno> membros) {
		this.membros = membros;
	}

	public final int getNumMembros() {
		return numMembros;
	}
	public final void setQntMembros(int numMembros) {
		this.numMembros = numMembros;
	}
	
	public final ITcc getTcc() {
		return tcc;
	}
	public final void setTcc(ITcc tcc) {
		this.tcc = tcc;
	}
}
