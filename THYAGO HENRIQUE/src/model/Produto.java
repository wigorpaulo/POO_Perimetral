package model;

import java.sql.Date;

public abstract class Produto {
	private int codigo;
	private String nome;
	private String descricao;
	private String marca;
	private Float preco_compra;
	private Float preco_venda;
	private Date validade;
	private int tipoProduto;
	private String cor;
	
public Produto(int codigo, String nome) {
	this.codigo = codigo;
	this.nome = nome;
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public Float getPreco_compra() {
	return preco_compra;
}

public void setPreco_compra(Float preco_compra) {
	this.preco_compra = preco_compra;
}

public Float getPreco_venda() {
	return preco_venda;
}

public void setPreco_venda(Float preco_venda) {
	this.preco_venda = preco_venda;
}

public Date getValidade() {
	return validade;
}

public void setValidade(Date validade) {
	this.validade = validade;
}

public int getTipoProduto() {
	return tipoProduto;
}

public void setTipoProduto(int tipoProduto) {
	this.tipoProduto = tipoProduto;
}

public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}

}