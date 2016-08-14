package br.semicheche.mdb;

import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;


@MessageDriven(name = "MdbAuditoria", activationConfig = {
	    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/TopicVenda"),
	    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic")})
public class MdbAuditoria implements MessageListener {

	 private final static Logger LOGGER = Logger.getLogger(MdbAuditoria.class.toString());
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
