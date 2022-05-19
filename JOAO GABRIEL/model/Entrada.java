package model;

import java.util.Date;

public class Entrada {
	private int produtoId;
	private int id;
	private float valor;
	private int fornecedorId;
	private float qntd;
	private Date dataLancamento;
	
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
	public float getQntd() {
		return qntd;
	}
	public void setQntd(float qntd) {
		this.qntd = qntd;
	}
	
	
}
