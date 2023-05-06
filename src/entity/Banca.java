package entity;

import java.util.Date;

public class Banca {
	private Date data;
//	participantes;//isso é lista de prof
//=====================================================================================
	public Banca(Date data) {
		this.data = data;
	}
//=====================================================================================
	public final Date getData() {
		return data;
	}

	public final void setData(Date data) {
		this.data = data;
	}
}
