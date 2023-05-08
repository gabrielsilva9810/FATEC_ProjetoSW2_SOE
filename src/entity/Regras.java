package entity;

import java.util.Date;
import java.util.List;

public class Regras {
	private String nomeTipo;
	private int qntMaxAlunos;
	private Date dtEntrega;
	private ICursos curso;
	private List<ITemplate> template;
//=====================================================================================
	public Regras() {
		
	}
	public Regras(String nomeTipo, int qntMaxAlunos, Date dtEntrega, ICursos curso, List<ITemplate> template) {
		this.nomeTipo = nomeTipo;
		this.qntMaxAlunos = qntMaxAlunos;
		this.dtEntrega = dtEntrega;
		this.curso = curso;
		this.template = template;
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
	
	public String getNomeTipo() {
		return nomeTipo;
	}
	public void setNomeTipo(String nomeTipo) {
		this.nomeTipo = nomeTipo;
	}
	public ICursos getCurso() {
		return curso;
	}
	public void setCurso(ICursos curso) {
		this.curso = curso;
	}
	public List<ITemplate> getTemplate() {
		return template;
	}
	public void setTemplate(List<ITemplate> template) {
		this.template = template;
	}
	
}
