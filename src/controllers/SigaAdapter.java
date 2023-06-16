package controllers;

public class SigaAdapter implements IDesistenciaTrancamento {

    public void obterDesistenciasTrancamentos() {
//		Ler arquivo do Siga e atualizar alunos com desistência e/ou trancamento
    	int RA_VindodoSiga=0;
    	AlunoController aluno = new AlunoController();
     	aluno.inserirTrancamento(aluno.buscar(RA_VindodoSiga));
    }
}	