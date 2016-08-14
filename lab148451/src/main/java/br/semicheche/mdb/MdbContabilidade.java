package br.semicheche.mdb;

import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

import br.univel.venda.Venda;

@MessageDriven(name = "MdbContabilidade", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/TopicVenda"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic") })
public class MdbContabilidade implements MessageListener {

	private final static Logger LOGGER = Logger.getLogger(MdbContabilidade.class.toString());

	@Override
	public void onMessage(Message message) {

		TextMessage msg = (TextMessage) message;
		try {
			LOGGER.info(this.getClass().getSimpleName() + " => " + msg.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
