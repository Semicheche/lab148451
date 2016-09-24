package br.semicheche.ejbs;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.semicheche.servelets.Config;
import br.semichehe.models.Entrega;

@Stateless
public class ProcessEntrega {
	
	@Inject
	private Config config;

	public void processarEntrega(Entrega entrega) {
		config.getContext().createProducer().send(config.getQueue(), entrega);
	}

}
