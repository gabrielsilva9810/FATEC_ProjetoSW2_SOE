package entity;

public class Administrativo {
	private String cargo;
//=====================================================================================
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
