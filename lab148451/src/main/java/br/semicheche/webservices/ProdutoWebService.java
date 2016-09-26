package br.semicheche.webservices;

import java.math.BigDecimal;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.semicheche.dao.ProdutoDao;
import br.semicheche.entities.Produto;

@WebService
public class ProdutoWebService {

	@EJB
	private ProdutoDao pdao;

	@WebMethod(operationName = "MethodCreateProduto")
	@WebResult(name = "resultCreateProduto")
	public void createProduto(@WebParam(name = "codigoDeBarras") String codigoDeBarras,
			@WebParam(name = "descricao") String descricao, @WebParam(name = "preco") BigDecimal preco) {
		pdao.create(new Produto(codigoDeBarras, descricao, preco));

	}

	@WebMethod(operationName = "MethodReadProduto")
	@WebResult(name = "resultReadProduto")
	public Produto readProduto(@WebParam(name = "id") Long id) {
		Produto produto = pdao.findById(id);
		return produto;
	}

	@WebMethod(operationName = "MethodUpdateProduto")
	@WebResult(name = "resultUpdateProduto")
	public void updateProduto(@WebParam(name = "id") Long id, @WebParam(name = "codigoDeBarras") String codigoDeBarras,
			@WebParam(name = "descricao") String descricao, @WebParam(name = "preco") BigDecimal preco) {

		Produto produto = new Produto();
		produto.setId(id);
		produto.setCodigoDeBarras(codigoDeBarras);
		produto.setDescricao(descricao);
		pdao.update(produto);

	}

	@WebMethod(operationName = "MethodDeleteProduto")
	@WebResult(name = "resultDeleteProduto")
	public void deleteProduto(@WebParam(name = "id") Long id) {
		pdao.deleteById(id);
	}

}
