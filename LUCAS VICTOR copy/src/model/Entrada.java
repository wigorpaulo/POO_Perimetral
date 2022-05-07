package model;

import java.util.Date;

public class Entrada {

	private int id;
	private int produtoId;
	private int fornecedorId;
	private float valor;
	private Date dataLancamento;
	private float quantidade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProdutoId() {
		return produtoId;
	}
	public void setProdutoId(int produtoId) {
		this.produtoId = produtoId;
	}
	public int getFornecedorId() {
		return fornecedorId;
	}
	public void setFornecedorId(int fornecedorId) {
		this.fornecedorId = fornecedorId;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Date getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public float getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
