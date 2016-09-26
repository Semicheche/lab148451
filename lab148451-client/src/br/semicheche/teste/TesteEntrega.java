package br.semicheche.teste;

import br.semicheche.ws.entrega.EntregaWebService;
import br.semicheche.ws.entrega.EntregaWebServiceService;

public class TesteEntrega {
	
	public static void main(String[] args) {
		
		EntregaWebServiceService entregaws = new EntregaWebServiceService();
		EntregaWebService ws = entregaws.getEntregaWebServicePort();
		ws.entrega("Endereço 1", 1);
	}

}
