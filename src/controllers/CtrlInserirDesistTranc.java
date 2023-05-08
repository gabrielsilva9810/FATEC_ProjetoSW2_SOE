package controllers;

import entity.Aluno;

public class CtrlInserirDesistTranc {
	public Aluno consultarAluno(Aluno Aluno) {
		return null;
	}
	public boolean gravarDados(Aluno aluno) {
		CtrlManterAluno alunoCtrl = new CtrlManterAluno();
		alunoCtrl.alterar(aluno);
		return true;
	}
}
