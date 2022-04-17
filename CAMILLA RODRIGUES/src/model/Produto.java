package model;

import java.util.Date;

public class Produto {
	private Integer codigo; 
	private String descricao;
	private String marca;
	private float precoCompra;
	private float precoVenda;
	private Date dataValidade;
	private Integer tipoProduto;
	private String cor;
	private Integer unidadeMedida;

	
	public Produto() {
		
	}
	
	public Produto(Integer codigo, String descricao, String marca, float precoCompra, float precoVenda, Date dataValidade, Integer tipoProduto, String cor, Integer unidadeMedida) {
		this.codigo=codigo;
		this.descricao=descricao;
		this.marca=marca;
		this.precoCompra=precoCompra;
		this.precoVenda=precoVenda;
		this.dataValidade=dataValidade;
		this.tipoProduto=tipoProduto;
		this.cor=cor;	
		this.unidadeMedida=unidadeMedida;

		
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Integer novoCodigo) {
		this.codigo=novoCodigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String alteraDescricao) {
		this.descricao=alteraDescricao;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String alteraMarca) {
		this.marca=alteraMarca;
	}
	
	public float getPrecoCompra() {
		return precoCompra;
	}
	
	public void setPrecoCompra(float precoCompra) {
		this.precoCompra=precoCompra;
	}
	
	public float getPrecoVenda() {
		return precoVenda;
	}
	
	public void setPrecoVenda(float precoVenda) {
		this.precoVenda=precoVenda;
	}
	
	public Date getDataValidade() {
		return dataValidade;
	}
	
	public void setDataValidade(Date dataValidade) {
		this.dataValidade=dataValidade;
	}
	
	public Integer getTipoProduto() {
		return tipoProduto;
	}
	
	public void setTipoProduto(Integer tipoProduto) {
		this.tipoProduto=tipoProduto;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor=cor;
	}
	
	public Integer getUnidadeMedida() {
		return unidadeMedida;
	}
	
	public void setUnidadeMedida(Integer unidadeMedida) {
		this.unidadeMedida=unidadeMedida;
	}
	

	@Override
	public String toString() {
		if(tipoProduto==1 && unidadeMedida==1) {
		return "Código Produto: " + codigo + "\nDescricao: " + descricao + "\nMarca=" + marca + "\nPreço Compra: "
				+ precoCompra + "\nPreço Venda: " + precoVenda + "\nTipo Produto: 1 - Perecível" +",\nCor: " + cor
				+ "\nUnidade Medida: Unidade\n";
		}
		else if(tipoProduto==1 && unidadeMedida==2) {
		return "Código Produto: " + codigo + "\nDescricao: " + descricao + "\nMarca=" + marca + "\nPreço Compra: "
				+ precoCompra + "\nPreço Venda: " + precoVenda + "\nTipo Produto: 1 - Perecível" +",\nCor: " + cor
				+ "\nUnidade Medida: Kg\n";
		}
		else if(tipoProduto==2 && unidadeMedida==1) {
		return "Código Produto: " + codigo + "\nDescricao: " + descricao + "\nMarca=" + marca + "\nPreço Compra: "
				+ precoCompra + "\nPreço Venda: " + precoVenda + "\nTipo Produto: 2 - Não Perecível" +",\nCor: " + cor
				+ "\nUnidade Medida: Unidade\n";
		}
				
		else {
			return "Código Produto: " + codigo + "\nDescricao: " + descricao + "\nMarca=" + marca + "\nPreço Compra: "
					+ precoCompra + "\nPreço Venda: " + precoVenda + "\nTipo Produto: 2 - Não Perecível" +",\nCor: " + cor
					+ "\nUnidade Medida: Kg\n";
		}
	}
	
	
	
	
	
}


