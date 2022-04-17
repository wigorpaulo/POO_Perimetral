package model;

public class Usuario {
	String nome, senha;
	public Usuario() {
		
	}
	
	public Usuario(String nome, String senha) {
		setNome(nome);
		setSenha(senha);
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void listar() {
		System.out.print("\nNome: " + this.nome);
	}

	public void inserirUsuario(Usuario novoUsuario) {
		
	}
}
