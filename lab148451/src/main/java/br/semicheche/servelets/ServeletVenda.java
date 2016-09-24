package br.semicheche.servelets;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.Queue;
import javax.jms.Topic;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.semicheche.ejbs.ProcessVenda;
import br.semichehe.models.Venda;

@WebServlet("/venda")
public class ServeletVenda extends HttpServlet implements Serializable {

	/**
	 * @author luciano
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Inject
    private ProcessVenda pv;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.getWriter().println("Criando Venda...");
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Produto 1");
		lista.add("Produto 2");
		lista.add("Produto 3");
		lista.add("Produto 4");
		
		Venda venda = new Venda();
		venda.setCodigo(1);
		venda.setDescricao("venda 1");
		venda.setValorVenda(new BigDecimal(10));
		venda.setListaDeItems(lista);

		pv.processarVenda(venda);
	}
}
