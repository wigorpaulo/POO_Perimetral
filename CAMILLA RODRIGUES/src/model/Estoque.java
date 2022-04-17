package model;



public class Estoque {
	
	private Produto produto;
	private Entrada entrada;
	private Saida saida;
	private float saldoQtdEstoque;
	private float valorTotalEstoque;
	
	
	public Integer getIdProduto() {
		return produto.getCodigo();
	}
	
	public void setIdProduto(Integer idProduto) {
		produto.setCodigo(idProduto);
	}
	
	public float getSaldoQtdEstoque(Integer idProduto) {
		saldoQtdEstoque=entrada.getQuantidade()-saida.getQuantidade();		
		return saldoQtdEstoque;
	}
	
	public float getValorTotalEstoque() {
		valorTotalEstoque=saldoQtdEstoque*entrada.getValor();
		return valorTotalEstoque;
	}
	
	
}


