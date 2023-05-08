package entity;

public class Administrativo extends Usuario {
	private String cargo;
//=====================================================================================
	public Administrativo() {
		
	}
	public Administrativo(String cargo) {
		this.cargo = cargo;
	}
//=====================================================================================
	public final String getCargo() {
		return cargo;
	}

	public final void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
