package controllers;

import java.util.List;

import entity.Regras;
import entity.Tcc;
import entity.Template;

public class Template07 {
	public Regras verificarTCC(Tcc tcc) {
		return null;
	}
	public Regras procuraRegra(Tcc tcc) {
		return null;
	}
	public List<Template> realizaDownload(Regras regra) {
		return null;
	}
	public void gravarTemplate(Regras regra) {
		RegrasController regras = new RegrasController();
		regras.novaRegra(null, 0, null, null);
	}
}
