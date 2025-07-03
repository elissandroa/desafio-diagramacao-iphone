package org.elissandro.modelIphone.interfaces;

import org.elissandro.modelIphone.services.Musica;

public interface ReprodutorMusical {
	void tocar();

	void pausar();

	void selecionar(Musica musica);

	void aumentarVolume();

	void diminuirVolume();
	
	void fechar();
}
