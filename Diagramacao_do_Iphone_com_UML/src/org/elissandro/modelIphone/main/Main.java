package org.elissandro.modelIphone.main;

import org.elissandro.modelIphone.entities.Iphone;
import org.elissandro.modelIphone.services.Chrome;
import org.elissandro.modelIphone.services.IeExplore;
import org.elissandro.modelIphone.services.Musica;
import org.elissandro.modelIphone.services.Video;

public class Main {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		iphone.ligar();
		iphone.tocar();
		iphone.atender();
		iphone.desligar();
		iphone.ligar();
		System.out.println("-----------------------------------------------------------------------");

		Musica musica1 = new Musica("Imagine", 3.05, "John Lennon", "Rock", "Classic");
		Musica musica2 = new Musica("Billie Jean", 4.54, "Michael Jackson", "Pop", "Classic");
		
		
		Video video1 = new Video("Thriller", 5.57, "Michael Jackson", "Musical");
		Video video2 = new Video("Bohemian Rhapsody", 5.55, "Queen", "Musical");
		
		
		iphone.setMusica(musica1);
		iphone.getMusica().tocar();
		iphone.getMusica().pausar();
		iphone.getMusica().selecionar(musica2);
		iphone.getMusica().aumentarVolume();
		iphone.getMusica().diminuirVolume();
		iphone.getMusica().fechar();
		System.out.println("-----------------------------------------------------------------------");
		iphone.setVideo(video1);
		iphone.getVideo().tocar();
		iphone.getVideo().pausar();
		iphone.getVideo().selecionar(video2);
		iphone.getVideo().aumentarVolume();
		iphone.getVideo().diminuirVolume();
		iphone.getVideo().fechar();
		System.out.println("-----------------------------------------------------------------------");
		
		System.out.println("Música: " + iphone.getMusica());
		System.out.println("Vídeo: " + iphone.getVideo());
		System.out.println("-----------------------------------------------------------------------");
		IeExplore navegador1 = new IeExplore();
		navegador1.exibirPagina("https://www.google.com");
		navegador1.navegarPara("https://www.youtube.com");
		navegador1.adicionarNovaAba("https://www.github.com");
		navegador1.atualizarPagina();
		navegador1.fecharAba("https://www.github.com");
		navegador1.fecharTodasAbas();
		navegador1.fecharNavegador();
		System.out.println("-----------------------------------------------------------------------");
		Chrome navegador2 = new Chrome();
		navegador2.exibirPagina("https://www.wikipedia.org");
		navegador2.navegarPara("https://www.stackoverflow.com");
		navegador2.adicionarNovaAba("https://www.reddit.com");
		navegador2.atualizarPagina();
		navegador2.fecharAba("https://www.reddit.com");
		navegador2.fecharTodasAbas();
		navegador2.fecharNavegador();

		
	}

}
