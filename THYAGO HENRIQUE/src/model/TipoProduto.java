package model;

public class TipoProduto extends Produto {
	private int id;
	private String descricao;
	public TipoProduto(int codigo, String nome, int id, String descricao) {
		super(codigo, nome);
		this.id = id;
		this.descricao = descricao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
