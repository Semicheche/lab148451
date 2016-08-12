package br.semichehe.entrega;

import br.univel.venda.Venda;

public class Entrega {
	
	private String endereco;
	private Venda venda;
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	
}
