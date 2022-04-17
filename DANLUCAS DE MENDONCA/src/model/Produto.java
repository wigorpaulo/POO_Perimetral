package model;

import java.util.Date;
import java.util.Scanner;

public class Produto {
	
	Scanner ler = new Scanner(System.in);

	private int cod;
	private String descricao;
	private String marca;
	private float precoCompra;
	private float precoVenda;
	private Date dateValidade;
	private int tipoProduto;
	private String cor;
	

	public int getCod() {
		return cod;
		
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	//----------------------------------------------
	public String getDescricao() {
		return descricao;	
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	//------------------------------------------------
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
//-------------------------------------------------
	
	
	public float getPrecoCompra() {
		return precoCompra;
	}
	public void setPrecoCompra(float precoCompra) {
		this.precoCompra = precoCompra;
	}
//-------------------------------------------------
	
	public float getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}
//-------------------------------------------------
	
	public Date getDateValidade() {
		return dateValidade;
	}
	public void setDateValidade(Date dateValidade) {
		this.dateValidade = dateValidade;
	}
//-------------------------------------------------
	
	public int getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(int tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
//-------------------------------------------------
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
}
