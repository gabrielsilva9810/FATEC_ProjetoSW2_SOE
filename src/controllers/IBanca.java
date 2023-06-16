package controllers;

import entity.Orientador;

public interface IBanca {
	void adicionarOrientador(Orientador orientador);
	void removerOrientador(Orientador orientador);
}
