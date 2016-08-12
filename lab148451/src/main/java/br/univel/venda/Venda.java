package br.univel.venda;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Venda {
	
	private int codigo;
	private String descricao;
	private BigDecimal valorVenda;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(BigDecimal valorVenda) {
		this.valorVenda = valorVenda;
	}
	public ArrayList<String> getListaDeItems() {
		return listaDeItems;
	}
	public void setListaDeItems(ArrayList<String> listaDeItems) {
		this.listaDeItems = listaDeItems;
	}
	private ArrayList<String> listaDeItems;

}
