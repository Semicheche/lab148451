package br.semicheche.ejbs;

import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.TextMessage;
import javax.jms.Topic;

import br.semicheche.mdb.MdbAuditoria;

public class MdbLogistica implements MessageListener {

	@Inject
    private JMSContext context;
	
	@Resource(lookup = "java:/queue/QueuePedido")
	private Queue queue;
	
	@Resource(lookup = "java:/topic/TopicVenda")
	private Topic topic;
	
	private final static Logger LOGGER = Logger.getLogger(MdbLogistica.class.toString());
	
	@Override
	public void onMessage(Message message) {
	TextMessage msg = (TextMessage) message;
	 try {
		 LOGGER.info(msg.getText());
		Thread.sleep(3000);
		LOGGER.info("Entrega Despachada...");
	} catch (InterruptedException | JMSException e) {
		e.printStackTrace();
	}

	}

}
