package model;

public class Produto {
private int codigo;
private String descricao;
private String marca;
private float precoCompra;
private float precoVenda;
private int validade;
private int tipoProduto;
private String cor;

public int getCodigo (){
	return codigo;
}
public void setCodigo (int codigo) {
	this.codigo = codigo;
}
public String getDescricao () {
	return descricao;
}
public void setDescricao (String descricao) {
	this.descricao = descricao;
}
public String getMarca () {
	return marca;
}
public void setMarca (String marca) {
	this.marca = marca;
}
public void setPrecoCompra(Float precoCompra) {
	this.precoCompra = precoCompra;
}
public float getPrecoVenda() {
	return precoVenda;
}
public void setPrecoVenda(Float precoVenda) {
	this.precoVenda = precoVenda;
}
public int getValidade() {
	return validade;
}
public void setValidade (int validade) {
	this.validade = validade;
}
public float getPrecoCompra() {
	return precoCompra;
}
public int getTipoProduto () {
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