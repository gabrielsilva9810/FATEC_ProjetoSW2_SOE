package entity;

public class TiposTCC {
	private String desenvolvimento;
	private String monografia;
	private String artigo;
//=====================================================================================
	public TiposTCC(String desenvolvimento, String monografia, String artigo) {
		this.desenvolvimento = desenvolvimento;
		this.monografia = monografia;
		this.artigo = artigo;
	}
//=====================================================================================
	public final String getDesenvolvimento() {
		return desenvolvimento;
	}
	public final void setDesenvolvimento(String desenvolvimento) {
		this.desenvolvimento = desenvolvimento;
	}
	public final String getMonografia() {
		return monografia;
	}
	public final void setMonografia(String monografia) {
		this.monografia = monografia;
	}
	public final String getArtigo() {
		return artigo;
	}
	public final void setArtigo(String artigo) {
		this.artigo = artigo;
	}
}
