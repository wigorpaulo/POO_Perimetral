package model;

import java.util.Date;

public class Produto {
	
	private int codigo;
	private String descricao;
	private String marca;
	private float precoCompra;
	private float precoVenda;
	private Date dataValidade;
	private int tipoProduto;
	private String cor;
	private int unidadeMedidaid;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPrecoCompra() {
		return precoCompra;
	}
	public void setPrecoCompra(float precoCompra) {
		this.precoCompra = precoCompra;
	}
	public float getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	
	
	

}
