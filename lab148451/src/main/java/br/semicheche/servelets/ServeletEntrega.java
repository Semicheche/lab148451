package br.semicheche.servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;
import javax.jms.Queue;
import javax.jms.Topic;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.semicheche.ejbs.ProcessEntrega;
import br.semicheche.ejbs.ProcessVenda;
import br.semichehe.entrega.Entrega;

@WebServlet("/entrega")
public class ServeletEntrega extends HttpServlet implements Serializable {

	/**
	 * @author luciano
	 */
	private static final long serialVersionUID = 1L;
	
	ProcessEntrega pe = new ProcessEntrega();
	
	@Resource(lookup = "java:/queue/QueuePedido")
	private Queue queue;
	
	@Resource(lookup = "java:/topic/TopicVenda")
	private Topic topic;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("txt/html");
		resp.getWriter().println("Entregando Venda...");
		
		Entrega entrega = new Entrega();
		entrega.setEndereco("Rua 1");
		entrega.setIdVenda(1);
		
		pe.processarEntrega(entrega);
	}

}
