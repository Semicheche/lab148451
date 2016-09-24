package br.semichehe.models;

import java.io.Serializable;

public class Entrega implements Serializable {
	
	private String endereco;
	private int idVenda;
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	@Override
	public String toString() {
		return "Entrega [endereco=" + endereco + ", idVenda=" + idVenda + "]";
	}
	
}
