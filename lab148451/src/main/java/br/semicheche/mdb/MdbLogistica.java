package br.semicheche.mdb;

import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import br.semichehe.models.Entrega;

@MessageDriven(name = "MdbLogistica", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "queue/QueuePedido"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })

public class MdbLogistica implements MessageListener {

	private final static Logger LOGGER = Logger.getLogger(MdbLogistica.class.toString());

	@Override
	public void onMessage(Message message) {
		Entrega msg = null;

		try {
			msg = (Entrega) message.getBody(Entrega.class);
			LOGGER.info(msg.toString());
			Thread.sleep(3000);
			LOGGER.info("Entrega Despachada...");
		} catch (InterruptedException | JMSException e) {
			e.printStackTrace();
		}

	}

}
