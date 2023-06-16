package controllers;

import entity.Tcc;

public interface Observavel {
	    void adicionarObservador(Observador observador);
	    void removerObservador(Observador observador);
	    void notificarObservadores(Tcc tcc);
	
}
