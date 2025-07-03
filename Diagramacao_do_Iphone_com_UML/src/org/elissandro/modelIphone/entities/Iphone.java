package org.elissandro.modelIphone.entities;

import org.elissandro.modelIphone.interfaces.Telefone;
import org.elissandro.modelIphone.services.Musica;
import org.elissandro.modelIphone.services.Video;

public class Iphone implements Telefone {
	
	private Musica musica;
	private Video video;
	
	public Iphone() {
	}
	

	public Musica getMusica() {
		return musica;
	}



	public void setMusica(Musica musica) {
		this.musica = musica;
	}



	public Video getVideo() {
		return video;
	}



	public void setVideo(Video video) {
		this.video = video;
	}



	@Override
	public void tocar() {
		System.out.println("Telefone tocando");
		
	}

	@Override
	public void ligar() {
		System.out.println("Ligando o Iphone");
		System.out.println("Iphone ligado com sucesso!");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada");
		
	}

	@Override
	public void desligar() {
		System.out.println("Desligando Iphone");
		System.out.println("Iphone desligado com sucesso!");
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciando correio de voz do Iphone");
		
	}

	@Override
	public void mutarVolume() {
		System.out.println("Mutando volume do Iphone");
		
	}

	@Override
	public void aumentarVolume() {
		System.out.println("Aumentando volume do Iphone");
		
	}

	@Override
	public void diminuirVolume() {
		System.out.println("Diminuindo volume do Iphone");
		
	}

	

}
