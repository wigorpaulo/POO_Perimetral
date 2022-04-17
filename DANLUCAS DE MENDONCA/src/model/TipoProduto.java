package model;

import java.util.Scanner;

public class TipoProduto {
	
	Scanner ler = new Scanner(System.in);

	private String id;
	private String descricao;
	
//-------------------------------------------------
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	//-------------------------------------------------
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
//-------------------------------------------------
	
}
