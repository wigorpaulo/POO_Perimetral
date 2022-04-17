package model;
public class Produto {
    private int codigo;
    private String descricao;
    private String marca;
    private float precoCompra;
    private float precoVenda;
    private String cor;
    private int unidadeMedidaId;
	
    public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getUnidadeMedidaId() {
		return unidadeMedidaId;
	}
	public void setUnidadeMedidaId(int unidadeMedidaId) {
		this.unidadeMedidaId = unidadeMedidaId;
	}
}
