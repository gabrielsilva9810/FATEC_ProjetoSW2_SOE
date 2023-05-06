package entity;

public class Aluno {
	private int ra;
	private int semestre;
	private String periodo;
	private int ciclo;
	private String status;
//=====================================================================================	
	public Aluno(int ra, int semestre, String periodo, int ciclo, String status) {
		this.ra = ra;
		this.semestre = semestre;
		this.periodo = periodo;
		this.ciclo = ciclo;
		this.status = status;
	}
//=====================================================================================
	public final int getRa() {
		return ra;
	}
	public final void setRa(int ra) {
		this.ra = ra;
	}
	public final int getSemestre() {
		return semestre;
	}
	public final void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public final String getPeriodo() {
		return periodo;
	}
	public final void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public final int getCiclo() {
		return ciclo;
	}
	public final void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}
	public final String getStatus() {
		return status;
	}
	public final void setStatus(String status) {
		this.status = status;
	}
}
