package model;

public class TipoPessoa {
	
	private Integer id;
	private String descricao;
	
	public TipoPessoa() {
		
	}
	
	public TipoPessoa(Integer id, String descricao) {
		this.id=id;
		this.descricao=descricao;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao=descricao;
	}

}

