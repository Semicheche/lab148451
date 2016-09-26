package br.semicheche.teste;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import br.semicheche.ws.venda.VendaWebService;
import br.semicheche.ws.venda.VendaWebServiceService;

public class TesteVenda {

	public static void main(String[] args) {

		List lista = Arrays.asList("Produto 1", "Produto 2", "Produto 3", "Produto 4");

		VendaWebServiceService vendaws = new VendaWebServiceService();
		VendaWebService service = vendaws.getVendaWebServicePort();
		service.venda(lista, 1, "Venda-Cliente 1", new BigDecimal("10"));

	}
}
