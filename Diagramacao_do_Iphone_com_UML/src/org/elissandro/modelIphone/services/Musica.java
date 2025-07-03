package org.elissandro.modelIphone.services;

import org.elissandro.modelIphone.interfaces.ReprodutorMusical;

public class Musica extends Media implements ReprodutorMusical {

	private String album;

	public Musica(String name, Double duracao, String artista, String album, String genero) {
		super(name, duracao, artista, genero);
		this.album = album;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	@Override
	public String toString() {
		return "Musica [nome=" + getName() + ", duracao=" + getDuracao() + ", artista=" + getArtista() + ", album="
				+ album + ", genero=" + getGenero() + "]";
	}

	@Override
	public void tocar() {
		System.out.println("Tocando música: " + getName() + " do álbum: " + album);
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música: " + getName());
		
	}

	@Override
	public void selecionar(Musica musica) {
		System.out.println("Selecionando música: " + musica.getName() + " no lugar de " + getName());
		setName(musica.getName());
		setDuracao(musica.getDuracao());
		setArtista(musica.getArtista());
		setAlbum(musica.getAlbum());
		setGenero(musica.getGenero());
		System.out.println("Música selecionada: " + this);
		
	}

	@Override
	public void aumentarVolume() {
		System.out.println("Aumentando volume da música: " + getName());
		
	}

	@Override
	public void diminuirVolume() {
		System.out.println("Diminuindo volume da música: " + getName());
		
	}

	@Override
	public void fechar() {
		System.out.println("Fechando música: " + getName());
		
	}

}
