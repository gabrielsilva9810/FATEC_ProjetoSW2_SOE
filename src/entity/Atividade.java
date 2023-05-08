package entity;

import java.time.LocalDateTime;
import java.util.Date;

public class Atividade {
	private String descricao;
	private Date dataAtiv;
	private LocalDateTime horario;
	private IGrupos grupo;
	private IOrientador orientador;

//=====================================================================================
	public Atividade() {
		
	}
	public Atividade( String descricao, Date dataAtiv, LocalDateTime horario, 
			          IGrupos grupo, IOrientador orientador) {
		this.descricao = descricao;
		this.dataAtiv = dataAtiv;
		this.horario = horario;
		this.grupo = grupo;
		this.orientador = orientador;

	}
//=====================================================================================
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataAtiv() {
		return dataAtiv;
	}
	public void setDataAtiv(Date dataAtiv) {
		this.dataAtiv = dataAtiv;
	}
	public LocalDateTime getHorario() {
		return horario;
	}
	public void setHorario(LocalDateTime horario) {
		this.horario = horario;
	}
	public IGrupos getGrupo() {
		return grupo;
	}
	public void setGrupo(IGrupos grupo) {
		this.grupo = grupo;
	}
	public IOrientador getOrientador() {
		return orientador;
	}
	public void setOrientador(IOrientador orientador) {
		this.orientador = orientador;
	}

}
