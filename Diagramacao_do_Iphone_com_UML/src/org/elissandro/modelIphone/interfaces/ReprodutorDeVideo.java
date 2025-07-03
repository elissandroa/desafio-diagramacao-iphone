package org.elissandro.modelIphone.interfaces;

import org.elissandro.modelIphone.services.Video;

public interface ReprodutorDeVideo {

	void tocar();

	void pausar();

	void selecionar(Video video);

	void aumentarVolume();

	void diminuirVolume();
	
	void fechar();
}
