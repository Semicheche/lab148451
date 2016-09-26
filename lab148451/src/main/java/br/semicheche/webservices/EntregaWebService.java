package br.semicheche.webservices;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.semicheche.ejbs.ProcessEntrega;
import br.semichehe.models.Entrega;

@WebService
public class EntregaWebService {
	
	
	@Inject
	ProcessEntrega pe;
	
	@WebMethod(operationName = "entrega")
	@WebResult(name = "resultEntrega")
	public void entrega(@WebParam(name = "endereco_entrega") String endereco, @WebParam(name = "id_entrega") int id) {
		
		Entrega entrega = new Entrega();
		entrega.setEndereco(endereco);
		entrega.setIdVenda(id);
		
		pe.processarEntrega(entrega);
	}

}
