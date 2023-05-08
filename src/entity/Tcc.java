package entity;

import java.util.Date;

public class Tcc {
	private String tema;
	private IRegras regra;
	private String areaEstudo;
	private String descricaoProj;
	private Date dtUltimaAtualiza;
	
//=====================================================================================
	public Tcc() {
		
	}

	public Tcc(String tema, IRegras regra, String areaEstudo, String descricaoProj, Date dtUltimaAtualiza) {
		this.tema = tema;
		this.regra = regra;
		this.areaEstudo = areaEstudo;
		this.descricaoProj = descricaoProj;
		this.dtUltimaAtualiza = dtUltimaAtualiza;
	}
//=====================================================================================

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public IRegras getRegra() {
		return regra;
	}

	public void setRegra(IRegras regra) {
		this.regra = regra;
	}

	public String getAreaEstudo() {
		return areaEstudo;
	}

	public void setAreaEstudo(String areaEstudo) {
		this.areaEstudo = areaEstudo;
	}

	public String getDescricaoProj() {
		return descricaoProj;
	}

	public void setDescricaoProj(String descricaoProj) {
		this.descricaoProj = descricaoProj;
	}

	public Date getDtUltimaAtualiza() {
		return dtUltimaAtualiza;
	}

	public void setDtUltimaAtualiza(Date dtUltimaAtualiza) {
		this.dtUltimaAtualiza = dtUltimaAtualiza;
	}

}
