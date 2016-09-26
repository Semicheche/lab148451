package br.semicheche.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

import br.semichehe.models.Venda;

@MessageDriven(name = "MdbLog", activationConfig = {
	    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/TopicVenda"),
	    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
	    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })
public class MdbLog extends AbstractMdb implements MessageListener {

	private String nome = this.getClass().getSimpleName();

	@Override
	public void onMessage(Message message) {

		Venda msg = null;

		try {
			msg = message.getBody(Venda.class);
			
			registro(nome, msg.toString());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}
