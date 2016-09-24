package br.semicheche.mdb;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import br.semichehe.models.Venda;

import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;

@MessageDriven(name = "MdbLog", activationConfig = {
	    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/TopicVenda"),
	    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
	    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })
public class MdbLog implements MessageListener {

	private final static Logger LOGGER = Logger.getLogger(MdbLog.class.toString());
	@Override
	public void onMessage(Message message) {
		Venda msg = null;
		
		try {
			msg = message.getBody(Venda.class);
			LOGGER.info(this.getClass().getSimpleName() + " => " + msg.toString());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
