package entity;

import java.util.Date;

public class Regras {
//	template;//outra classe
//	regraAbnt;
	private int qntMaxAlunos;
	private Date dtEntrega;
//=====================================================================================
	public Regras(int qntMaxAlunos, Date dtEntrega) {
		this.qntMaxAlunos = qntMaxAlunos;
		this.dtEntrega = dtEntrega;
	}
//=====================================================================================	
	public final int getQntMaxAlunos() {
		return qntMaxAlunos;
	}
	public final void setQntMaxAlunos(int qntMaxAlunos) {
		this.qntMaxAlunos = qntMaxAlunos;
	}
	public final Date getDtEntrega() {
		return dtEntrega;
	}
	public final void setDtEntrega(Date dtEntrega) {
		this.dtEntrega = dtEntrega;
	}
	
	
}
