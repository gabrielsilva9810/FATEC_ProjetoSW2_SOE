package controllers;

import java.util.Date;

import entity.Grupos;

public class AgendarAtividades18 {
	public Grupos procurarGrupo() {
		return null;
	}
	
	public void salvarAgendamento(Grupos grupo, Date data, String atividade) {
		AtividadeController atividadeCtrl = new AtividadeController();
		atividadeCtrl.agendarAtividade(grupo, null);
	}
}
