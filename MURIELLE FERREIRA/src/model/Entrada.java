package model;

import java.util.Date;

public class Entrada {
	private int id;
	private int produtoId;
	private int fornecedorId;
	private float valor;
	private float quantidade;
	private Date dataLancamento;
	
	
	public void setProdutoId(int produtoId) {
		this.produtoId = produtoId;

	}

	public int getProdutoId() {
		return produtoId;
	}

	public void setFornecedorId(int fornecedorId) {
		this.fornecedorId= fornecedorId;

	}

	public int getFornecedorId() {
		return fornecedorId;
	}
	public void setvalor(float valor) {
		this.valor = valor;

	}

	public float getValor() {
		return valor;
	}
	
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;

	}

	public float getQuantidade() {
		return quantidade;
	}
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;

	}

	public Date getDataLancamento() {
		return dataLancamento;
	}
}
