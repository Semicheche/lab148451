package br.semicheche.ejbs;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.Topic;

import br.semicheche.servelets.Config;
import br.univel.venda.Venda;

@Stateless
public class ProcessVenda {
	
	@Inject
	private JMSContext context;
	private Config config;
	
	public void processarVenda(Venda venda) {
		context.createProducer().send(config.topic, venda);
	}

}
