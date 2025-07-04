package org.elissandro.modelIphone.interfaces;

public interface Navegador {

	void exibirPagina(String url);

	void navegarPara(String url);

	void adicionarNovaAba(String url);

	void atualizarPagina();

	void fecharAba(String url);

	void fecharTodasAbas();

	void fecharNavegador();
}
