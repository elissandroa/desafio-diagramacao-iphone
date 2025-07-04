package org.elissandro.modelIphone.services;

import org.elissandro.modelIphone.interfaces.Navegador;

public class Chrome implements Navegador{

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página: " + url);
	}

	@Override
	public void navegarPara(String url) {
		System.out.println("Navegando para: " + url);
		
	}

	@Override
	public void adicionarNovaAba(String url) {
		System.out.println("Adicionando nova aba com URL: " + url);
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página atual");
		
	}

	@Override
	public void fecharAba(String url) {
		System.out.println("Fechando aba com URL: " + url);
		
	}

	@Override
	public void fecharTodasAbas() {
		System.out.println("Fechando todas as abas do navegador");
		
	}

	@Override
	public void fecharNavegador() {
		System.out.println("Fechando o navegador Chrome");
	}

}
