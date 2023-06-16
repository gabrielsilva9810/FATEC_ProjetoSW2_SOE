package controllers;

import java.util.List;
import entity.Tcc;
import java.util.ArrayList;

public class ObservavelImpl implements Observavel {
	    private List<Observador> observadores = new ArrayList<>();

	    @Override
	    public void adicionarObservador(Observador observador) {
	        observadores.add(observador);
	    }

	    @Override
	    public void removerObservador(Observador observador) {
	        observadores.remove(observador);
	    }

	    @Override
	    public void notificarObservadores(Tcc tcc) {
	        for (Observador observador : observadores) {
	            observador.atualizar(tcc);
	        }
	    }

	    public void atualizarStatusTCC(Tcc tcc) {
	        // Lógica para atualizar o status do TCC
	        notificarObservadores(tcc);
	    }
	
}
