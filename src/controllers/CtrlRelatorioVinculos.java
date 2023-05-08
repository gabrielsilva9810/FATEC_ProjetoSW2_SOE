package controllers;

public class CtrlRelatorioVinculos {
	public void gerarRelatorioporAluno() {
			
		CtrlVinculo vinculo = new CtrlVinculo();
		vinculo.carregarVinculo();
	}
	
	public void gerarRelatorioporOrientador() {

		CtrlVinculo vinculo = new CtrlVinculo();
		vinculo.carregarVinculo();
	}
}
