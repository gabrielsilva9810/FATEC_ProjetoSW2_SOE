package controllers;

import entity.Orientador;

public class MontarBanca {

    public void insereConvite(Orientador orientador) {
    	BancaComposicao bancaComposicao = new BancaComposicao(orientador.getNome());
    	bancaComposicao.adicionarOrientador(orientador);
    }

	public Orientador procuraOrientador(String nome) {
		return null;
	}

}
