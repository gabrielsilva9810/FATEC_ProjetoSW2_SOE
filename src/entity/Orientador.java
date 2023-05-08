package entity;

import java.util.List;

public class Orientador extends Usuario {
	private int rp;
	private String curriculo;
	private String areaEspecializada;
	private String cargo;
	private List<IOrientador> orientador;
	private List<ICursos> curso;
//=====================================================================================
	public Orientador() {
		
	}
	
	public Orientador(int rp, String curriculo, String areaEspecializada, String cargo,
			          List<IOrientador> orientador, List<ICursos> curso) {
		this.rp = rp;
		this.curriculo = curriculo;
		this.areaEspecializada = areaEspecializada;
		this.cargo = cargo;
		this.orientador = orientador;
		this.curso = curso;
	}
	

	//=====================================================================================
	public final int getRp() {
		return rp;
	}

	public final void setRp(int rp) {
		this.rp = rp;
	}
	
	public final String getCurriculo() {
		return curriculo;
	}
	
	public final void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}
	public final String getAreaEspecializada() {
		return areaEspecializada;
	}
	public final void setAreaEspecializada(String areaEspecializada) {
		this.areaEspecializada = areaEspecializada;
	}
	public final String getCargo() {
		return cargo;
	}
	public final void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public List<IOrientador> getOrientador() {
		return orientador;
	}

	public void setOrientador(List<IOrientador> orientador) {
		this.orientador = orientador;
	}

	public List<ICursos> getCurso() {
		return curso;
	}

	public void setCurso(List<ICursos> curso) {
		this.curso = curso;
	}
	
}
