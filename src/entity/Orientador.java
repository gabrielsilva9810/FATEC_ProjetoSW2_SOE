package entity;

public class Orientador {
	private String curriculo;
	private String areaEspecializada;
	private String cargo;
//=====================================================================================
	public Orientador(String curriculo, String areaEspecializada, String cargo) {
		this.curriculo = curriculo;
		this.areaEspecializada = areaEspecializada;
		this.cargo = cargo;
	}
//=====================================================================================
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
}
