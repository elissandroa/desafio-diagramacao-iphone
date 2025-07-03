package org.elissandro.modelIphone.services;

import org.elissandro.modelIphone.interfaces.ReprodutorDeVideo;

public class Video extends Media implements ReprodutorDeVideo {

	public Video(String name, Double duracao, String artista, String genero) {
		super(name, duracao, artista, genero);
	}

	@Override
	public String toString() {
		return "Video [nome=" + getName() + ", duracao=" + getDuracao() + ", artista=" + getArtista() + ", genero="
				+ getGenero() + "]";
	}

	@Override
	public void tocar() {
		System.out.println("Tocando vídeo: " + getName());
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando vídeo: " + getName());
		
	}

	@Override
	public void selecionar(Video video) {
		System.out.println("Selecionando vídeo: " + video.getName() + " no lugar de " + getName());
		setName(video.getName());
		setDuracao(video.getDuracao());
		setArtista(video.getArtista());
		setGenero(video.getGenero());
		
	}

	@Override
	public void aumentarVolume() {
		System.out.println("Aumentando volume do vídeo: " + getName());
		
	}

	@Override
	public void diminuirVolume() {
		System.out.println("Diminuindo volume do vídeo: " + getName());
		
	}

	@Override
	public void fechar() {
		System.out.println("Fechando vídeo: " + getName());
	}

}
