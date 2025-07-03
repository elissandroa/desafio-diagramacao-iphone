package org.elissandro.modelIphone.services;

public abstract class Media {

	private String nome;
	private Double duracao;
	private String artista;
	private String genero;

	public Media(String name, Double duracao, String artista, String genero) {
		this.nome = name;
		this.duracao = duracao;
		this.artista = artista;
		this.genero = genero;
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public Double getDuracao() {
		return duracao;
	}

	public void setDuracao(Double duracao) {
		this.duracao = duracao;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
