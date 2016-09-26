package br.semicheche.entities;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;
import java.math.BigDecimal;

@Entity
@Table(name = "produto")
public class Produto implements Serializable {
	
	
	public Produto(){}
	
	public Produto(String codigoDeBarras, String descricao, BigDecimal preco) {
		this.codigoDeBarras = codigoDeBarras;
		this.descricao = descricao;
		this.preco = preco;
	}

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	@Version
	@Column(name = "version")
	private int version;

	@Column(name = "codigo_de_barras", nullable = false)
	private String codigoDeBarras;

	@Column(name = "descricao", nullable = false)
	private String descricao;

	@Column(name = "preco")
	private BigDecimal preco;

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(final int version) {
		this.version = version;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Produto)) {
			return false;
		}
		Produto other = (Produto) obj;
		if (id != null) {
			if (!id.equals(other.id)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (codigoDeBarras != null && !codigoDeBarras.trim().isEmpty())
			result += "codigoDeBarras: " + codigoDeBarras;
		if (descricao != null && !descricao.trim().isEmpty())
			result += ", descricao: " + descricao;
		return result;
	}
}