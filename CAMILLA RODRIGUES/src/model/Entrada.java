package model;

import java.util.Date;

public class Entrada {
	private Integer id;
	private Integer produtoId;
	private Integer fornecedorId;
	private float valor;
	private Date dataLancamento;
	private float quantidade;
	
	
	public Entrada() {
		
	}
	
	public Entrada(Integer id, Integer produtoId, Integer fornecedorId, float valor, Date dataLancamento, float quantidade) {
		this.id=id; 
		this.produtoId=produtoId;
		this.fornecedorId=fornecedorId;
		this.valor=valor;
		this.dataLancamento=dataLancamento;
		this.quantidade=quantidade;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id=id;
	}
	
	public Integer getProdutoId() {
		return produtoId;
	}
	
	public void setProdutoId(Integer produtoId) {
		this.produtoId=produtoId;
	}
	
	public Integer getFornecedorId() {
		return fornecedorId;
	}
	
	public void setFornecedorId(Integer fornecedorId) {
		this.fornecedorId=fornecedorId;
	}
	
	public float getValor() {
		return valor;		
	}
	
	public void setValor(float valor) {
		this.valor=valor;
	}
	
	public Date getDataLancamento() {
		return dataLancamento;
	}
	
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento=dataLancamento;
	}
	
	public float getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(float quantidade) {
		this.quantidade=quantidade;
	}

}

