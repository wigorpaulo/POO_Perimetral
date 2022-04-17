package Model;

import java.sql.Date;

public class Produto {

	private int codigo;
	private String descrição;
	private String marca;
	private float preçoCompra;
	private float preçoVenda;
	private Date dataValidade;
	private int tipoProduto;
	private String cor;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setdataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
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
	public float getPreçoCompra() {
		return preçoCompra;
	}
	public void setPreçoCompra(float preçoCompra) {
		this.preçoCompra = preçoCompra;
	}
	public float getPreçoVenda() {
		return preçoVenda;
	}
	public void setPreçoVenda(float preçoVenda) {
		this.preçoVenda = preçoVenda;
	}
	

}