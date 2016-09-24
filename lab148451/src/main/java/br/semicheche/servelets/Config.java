package br.semicheche.servelets;


import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.Queue;
import javax.jms.Topic;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/Config")
public class Config extends HttpServlet {

	/**
	 * @author luciano
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	JMSContext context;
	
	@Resource(lookup = "java:/queue/QueuePedido")
	public Queue queue;
	
	@Resource(lookup = "java:/topic/TopicVenda")
	public Topic topic;
	
    public JMSContext getContext() {
    	return context;
    }
    
    public Queue getQueue() {
    	return queue;
    }
    
    public Topic getTopic() {
    	return topic;
    }
	
}
