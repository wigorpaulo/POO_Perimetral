package model;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private String genero;
	private String endereco;
	private String telefone;

	public void setNome(String nome) {
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;

	}

	public String getCpf() {
		return cpf;
	}

	public void setGenero(String genero) {
		this.genero = genero;

	}

	public String getGenero() {
		return genero;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;

	}

	public String getEndereco() {
		return endereco;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;

	}

	public String getTelefone() {
		return telefone;
	}
}
