package entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Banca {
	private Date data;
	private LocalDateTime horario;
	private double nota;
	private double media;
	private IOrientador orientador;
	private List<IOrientador> orientadores;
	private IGrupos grupo;

//=====================================================================================
	public Banca() {
		
	}
	
	public Banca(Date data, LocalDateTime horario, double nota, double media, 
			     IOrientador orientador, List<IOrientador> orientadores, IGrupos grupo) {
		this.data = data;
		this.horario = horario;
		this.nota = nota;
		this.media = media;
		this.orientador = orientador;
		this.orientadores = orientadores;
		this.grupo = grupo;
	}
//=====================================================================================

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public LocalDateTime getHorario() {
		return horario;
	}

	public void setHorario(LocalDateTime horario) {
		this.horario = horario;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public IOrientador getOrientador() {
		return orientador;
	}

	public void setOrientador(IOrientador orientador) {
		this.orientador = orientador;
	}

	public List<IOrientador> getOrientadores() {
		return orientadores;
	}

	public void setOrientadores(List<IOrientador> orientadores) {
		this.orientadores = orientadores;
	}

	public IGrupos getGrupo() {
		return grupo;
	}

	public void setGrupo(IGrupos grupo) {
		this.grupo = grupo;
	}
}
