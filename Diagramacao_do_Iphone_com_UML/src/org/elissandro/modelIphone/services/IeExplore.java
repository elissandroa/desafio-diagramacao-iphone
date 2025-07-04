package org.elissandro.modelIphone.services;

import org.elissandro.modelIphone.interfaces.Navegador;

public class IeExplore implements Navegador {

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página no Internet Explorer: " + url);
		
	}

	@Override
	public void navegarPara(String url) {
		System.out.println("Navegando para: " + url + " no Internet Explorer");
		
	}

	@Override
	public void adicionarNovaAba(String url) {
		System.out.println("Adicionando nova aba com URL: " + url + " no Internet Explorer");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página no Internet Explorer");
		
	}

	@Override
	public void fecharAba(String url) {
		System.out.println("Fechando aba com URL: " + url + " no Internet Explorer");
		
	}

	@Override
	public void fecharTodasAbas() {
		System.out.println("Fechando todas as abas no Internet Explorer");
		
	}

	@Override
	public void fecharNavegador() {
		System.out.println("Fechando o Internet Explorer");
		
	}

}
