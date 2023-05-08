package controllers;

import java.util.Date;

import entity.Cursos;
import entity.Regras;

public class TiposTCC08 {
	public Cursos verificarCoord(int rp) {
		return null;
	}
	
	public Regras verificarRegra(String nome, int qntAluno, Date dtEntrega) {
		return null;
	}
	
	public void salvarRegra(String nome, int qntAluno, Date dtEntrega) {
		RegrasController regra = new RegrasController();
		regra.novaRegra(nome, qntAluno, dtEntrega, null);
	}
}
