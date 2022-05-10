package model;

import java.util.Date;

public class Produto {
	
	//Atributos
  private int codigo;
  private int tipoProduto;
  private String descricao;
  private String marca;
  private String cor;
  private float preco_compra;
  private float preco_venda;
  private String dataValidade;
  
  //Métodos 
  
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public int getTipoProduto() {
	return tipoProduto;
}
public void setTipoProduto(int tipoProduto) {
	this.tipoProduto = tipoProduto;
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
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}
public float getPreco_compra() {
	return preco_compra;
}
public void setPreco_compra(float preco_compra) {
	this.preco_compra = preco_compra;
}
public float getPreco_venda() {
	return preco_venda;
}
public void setPreco_venda(float preco_venda) {
	this.preco_venda = preco_venda;
}
public String getDataValidade() {
	return dataValidade;
}
public void setDataValidade(String value) {
	this.dataValidade = value;
}
  


  
  
}
