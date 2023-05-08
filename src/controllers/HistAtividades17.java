package controllers;

import javax.swing.JCheckBox;

public class HistAtividades17 {
	public void consultarAtividade(JCheckBox chckbxAdministrativo,JCheckBox chckbxAlunos,JCheckBox chckbxNewCheckBox) {
		
		if (chckbxAlunos!=null) {
			consultarAluno();
		} else if(chckbxAdministrativo!=null){
			consultarProfessor();
		} else if(chckbxNewCheckBox!=null) {
			consultarCoordenador();
		}else {
			consultarAluno();
			consultarProfessor();
			consultarCoordenador();			
		}
	}
	public void consultarAluno() {
		
	}
	public void consultarProfessor() {
	
	}
	public void consultarCoordenador() {
	
	}
}
