package entity;

public class Grupos {
	String membros;
	int qntMembros;
//=====================================================================================
	public Grupos(String membros, int qntMembros) {
		this.membros = membros;
		this.qntMembros = qntMembros;
	}
//=====================================================================================
	public final String getMembros() {
		return membros;
	}
	public final void setMembros(String membros) {
		this.membros = membros;
	}
	public final int getQntMembros() {
		return qntMembros;
	}
	public final void setQntMembros(int qntMembros) {
		this.qntMembros = qntMembros;
	}
}
