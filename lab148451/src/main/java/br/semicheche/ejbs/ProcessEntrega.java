package br.semicheche.ejbs;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.Message;
import javax.jms.Queue;
import javax.jms.Topic;

import br.semicheche.servelets.Config;
import br.semichehe.entrega.Entrega;

@Stateless
public class ProcessEntrega {
	
	@Inject
	private JMSContext context;
	private Config config;

	public void processarEntrega(Entrega entrega) {
		context.createProducer().send(config.queue, entrega);
	}

}
