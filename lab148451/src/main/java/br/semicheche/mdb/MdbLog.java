package br.semicheche.mdb;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;

@MessageDriven(name = "MdbLog", activationConfig = {
	    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/TopicVenda"),
	    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic")})
public class MdbLog implements MessageListener {

	private final static Logger LOGGER = Logger.getLogger(MdbLog.class.toString());
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
