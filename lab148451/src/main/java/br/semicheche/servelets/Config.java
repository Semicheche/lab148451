package br.semicheche.servelets;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;
import javax.jms.Queue;
import javax.jms.Topic;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@JMSDestinationDefinitions(
	value = { 
		@JMSDestinationDefinition( 
			name = "java:/queue/QueuePedido",
			interfaceName = "javax.jms.Queue",
			destinationName = "QueuePedido"
		),
		@JMSDestinationDefinition(
			name = "java:/topic/TopicVenda",
			interfaceName = "javax.jms.Topic",
			destinationName = "TopicVenda"
		)
	})
@WebServlet("/Config")
public class Config extends HttpServlet {

	/**
	 * @author luciano
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
    private JMSContext context;
	
	@Resource(lookup = "java:/queue/QueuePedido")
	private Queue queue;
	
	@Resource(lookup = "java:/topic/TopicVenda")
	private Topic topic;

}
