package controllers;

import entity.Aluno;

public class InserirDesistTranc02 {
	public Aluno consultarAluno(Aluno Aluno) {
		return null;
	}
	public boolean gravarDados(Aluno aluno) {
		AlunoController alunoCtrl = new AlunoController();
		alunoCtrl.alterar(aluno);
		return true;
	}
}
