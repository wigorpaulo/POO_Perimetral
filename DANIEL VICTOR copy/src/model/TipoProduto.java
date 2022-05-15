package model;

public class TipoProduto {

	// atributos

	private int id;
	private String descricao;

	// m�todos

	public TipoProduto(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
