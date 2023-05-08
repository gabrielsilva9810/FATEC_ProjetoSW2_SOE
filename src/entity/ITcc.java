package entity;

import java.util.Date;

public interface ITcc {
	public void alterar(Tcc tcc);
	public void excluir(Tcc tcc);
	public void gravar(Tcc tcc, Regras regra);
	public Tcc buscar(String tema);
	public void gravarDtAtualiza(Tcc tcc, Regras regra);
	public Tcc buscarDtAtualiza(Date date);
}
