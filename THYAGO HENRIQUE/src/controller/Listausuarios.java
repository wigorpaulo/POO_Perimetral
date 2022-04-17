package controller;
import java.util.ArrayList;

import model.Usuario;

public class Listausuarios {
	private String nome;
	private String senha;
	
	
	public Listausuarios(String nome, String senha, ArrayList<Usuario> listaUsuario) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.listaUsuario = listaUsuario;
	}
	ArrayList<Usuario> listaUsuario;


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
	public ArrayList<Usuario> getListaUsuario() {
		return listaUsuario;
	}
	public void setListaUsuario(ArrayList<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
	
	
	

}

