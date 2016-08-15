package br.semicheche.servelets;


import javax.annotation.Resource;
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
			destinationName = "MDBQueuePedido"
		), 
		@JMSDestinationDefinition(
			name = "java:/topic/TopicVenda",
			interfaceName = "javax.jms.Topic",
			destinationName = "MDBTopicVenda"
		)
	})
@WebServlet("/Config")
public class Config extends HttpServlet {

	/**
	 * @author luciano
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Resource(lookup = "java:/queue/QueuePedido")
	public Queue queue;
	
	@Resource(lookup = "java:/topic/TopicVenda")
	public Topic topic;
	
}
