package br.semicheche.ejbs;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.Topic;

import br.semicheche.servelets.Config;
import br.semichehe.models.Venda;


@Stateless
public class ProcessVenda {
	
	@Inject
	private Config config;
	
	public void processarVenda(Venda venda) {
		config.getContext().createProducer().send(config.getTopic(), venda);
	}

}
