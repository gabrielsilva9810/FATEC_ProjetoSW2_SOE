package controllers;

import java.util.Date;

import entity.Cursos;
import entity.Regras;
import entity.Tcc;
import entity.Template;

public class CtrlTiposTCC {
	public Cursos verificarCoord(int rp) {
		return null;
	}

	public Regras verificarRegra(String nome, int qntAluno, Date dtEntrega) {
		return null;
	}

	public void salvarRegra(String nome, int qntAluno, Date dtEntrega) {
		
	}

	public void alterar(Tcc tcc) {

	}

	public void excluir(Tcc tcc) {

	}

	public void gravar(Tcc tcc, Regras regra) {

	}

	public Tcc buscar(String tema) {
		return null;
	}

	public void gravarDtAtualiza(Tcc tcc, Regras regra) {

	}

	public Tcc buscarDtAtualiza(Date data) {
		return null;
	}

	public void novaRegra(String nomeTipo, int qtdAluno, Date dtEntrega, Template template) {

	}

	public void alterarRegra(Regras regra, Template template) {

	}

	public boolean temRegra(String nomeTipo) {
		return true;
	}

	public boolean procurarRegra(String nomeRegra) {
		return true;
	}

	public Regras buscarRegra(String nomeTipo, int qtdAluno, Date dtEntrega) {
		return null;
	}
}
