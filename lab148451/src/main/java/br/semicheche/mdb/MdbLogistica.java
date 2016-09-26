package br.semicheche.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

import br.semichehe.models.Entrega;

@MessageDriven(name = "MdbLogistica", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "queue/QueuePedido"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })

public class MdbLogistica extends AbstractMdb implements MessageListener {

	private String nome = this.getClass().getSimpleName();

	@Override
	public void onMessage(Message message) {
		Entrega msg = null;

		try {
			msg = (Entrega) message.getBody(Entrega.class);
			
			registro(nome, msg.toString());
			Thread.sleep(3000);
			registro(nome, "Entrega Despachada...");
			
		} catch (InterruptedException | JMSException e) {
			e.printStackTrace();
		}

	}

}
