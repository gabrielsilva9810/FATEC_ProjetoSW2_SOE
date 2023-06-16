package controllers;

import java.util.List;
import entity.Cursos;
import entity.Orientador;
import entity.Tcc;

public class Dash20 {
	public List<Cursos> carregarCursos() {
		return null;
	}
	
	public Cursos lerCurso(Cursos curso) {
		return null;
	}

	public List<Orientador> carregaOrientadores() {
		return null;
	}
	
	public Orientador lerOrientador(Orientador orientador) {
		return null;
	}

	public void montaDashBoard(Cursos curso, Orientador orientador) {
        
        Observavel controleTCC = new ObservavelImpl();

        Observador dashboard1 = new ObservadorImpl();
        Observador dashboard2 = new ObservadorImpl();

        controleTCC.adicionarObservador(dashboard1);
        controleTCC.adicionarObservador(dashboard2);

        Tcc tcc = new Tcc();
        ((ObservavelImpl) controleTCC).atualizarStatusTCC(tcc);
	}
}
