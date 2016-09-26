package br.semicheche.webservices;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.semicheche.ejbs.ProcessVenda;
import br.semichehe.models.Venda;

@WebService
public class VendaWebService {
	
	@Inject
    private ProcessVenda pv;
	
	@WebMethod(operationName = "Venda")
	@WebResult(name = "resultVenda")
	public void venda(@WebParam(name = "listaVenda") ArrayList<String> lista, 
					  @WebParam(name = "id_venda") int id, 
					  @WebParam(name = "descricao_venda") String descricao, 
					  @WebParam(name = "valor_venda") BigDecimal valor){
		
		ArrayList<String> l = lista;
		
		Venda venda = new Venda();
		venda.setCodigo(id);
		venda.setDescricao(descricao);
		venda.setValorVenda(valor);
		venda.setListaDeItems(l);

		pv.processarVenda(venda);
	 
	}
}
