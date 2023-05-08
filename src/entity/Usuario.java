package entity;

public class Usuario {
	private String nome;
	private String email;
	private String tel;
//=====================================================================================
	public Usuario() {
		
	}
	
	public Usuario(String nome, String email, String tel) {
		this.nome = nome;
		this.email = email;
		this.tel = tel;
	}
//=====================================================================================	
	public final String getNome() {
		return nome;
	}
	public final void setNome(String nome) {
		this.nome = nome;
	}
	public final String getEmail() {
		return email;
	}
	public final void setEmail(String email) {
		this.email = email;
	}
	public final String getTel() {
		return tel;
	}
	public final void setTel(String tel) {
		this.tel = tel;
	}
}
