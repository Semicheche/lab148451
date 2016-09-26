package br.semicheche.teste;

import java.math.BigDecimal;

import br.semicheche.ws.produto.Produto;
import br.semicheche.ws.produto.ProdutoWebService;
import br.semicheche.ws.produto.ProdutoWebServiceService;

public class TesteProdutoDao {
	
	public static void main(String[] args) {
		TesteProdutoDao p = new TesteProdutoDao();
		
		p.create();
		p.update(new Long(4));
		p.read(new Long(4));
		p.delete(new Long(10));
	}

	private void create() {
		for (int i = 0; i < 10; i++) {
			getMethod().methodCreateProduto("000000"+i, "Produto "+i, new BigDecimal((++i)+"0"));
		}
	}

	private void read(Long id){
		Produto produto = getMethod().methodReadProduto(id);
		
		StringBuilder str = new StringBuilder();
		str.append("PRODUTO =>");
		str.append(" ID : " + produto.getId());
		str.append(" Codigo de barras : " + produto.getCodigoDeBarras());
		str.append(" Descrição : " + produto.getDescricao());
		str.append(" Preço : " + produto.getPreco());
		
		System.out.println(str);
	}

	private void update(Long id) {
		getMethod().methodUpdateProduto(id, "11111111", "produto 111", new BigDecimal("111"));
	}

	private void delete(Long id) {
		getMethod().methodDeleteProduto(id);
	}
	
	private ProdutoWebService getMethod(){
		ProdutoWebServiceService produtows = new ProdutoWebServiceService();
		ProdutoWebService service = produtows.getProdutoWebServicePort();
		return service;
	}

}
