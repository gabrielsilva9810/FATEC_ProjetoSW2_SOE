package entity;

import java.io.File;

public interface ITemplate {
	public File carregar();
	public void salvar(File file);
	public void excluir(File file);
}
