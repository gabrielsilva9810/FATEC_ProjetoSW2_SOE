package entity;

import java.util.Date;

public class Atividade {
	private Date dataAtiv;
//=====================================================================================
	public Atividade(Date dataAtiv) {
		this.dataAtiv = dataAtiv;
	}
//=====================================================================================
	public final Date getDataAtiv() {
		return dataAtiv;
	}

	public final void setDataAtiv(Date dataAtiv) {
		this.dataAtiv = dataAtiv;
	}
}
