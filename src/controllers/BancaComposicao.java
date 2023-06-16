package controllers;

import java.util.ArrayList;
import java.util.List;

import entity.Orientador;

public class BancaComposicao implements IBanca {

	    private String nome;
	    private List<Orientador> banca;

	    public BancaComposicao(String nome) {
	        this.nome = nome;
	        banca = new ArrayList<>();
	    }

	    public void adicionarOrientador(Orientador orientador) {
	        banca.add(orientador);
	    }

	    public void removerOrientador(Orientador orientador) {
	        banca.remove(orientador);
	    }

	    public String toString() {
	        return nome;
	    }
}
