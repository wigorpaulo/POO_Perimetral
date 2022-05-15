package service;

import java.util.ArrayList;

import model.Usuario;

public class UsuarioService {

	
	public ArrayList<Usuario> ler() {
		Usuario usuario = new Usuario();
		ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();
		
		listaUsuario.add(usuario);
		
		return listaUsuario;
	}

	public void escrever(Usuario usuario) {
		
	}
	
	public boolean  ler(Usuario usuario) {
		
		
		return true;
		
	}
	
	
	public void criar() {
		
	}
	
	public void excluir() {
		
	}
	
	
    public Usuario ler(String ler) {
		Usuario usuario = new Usuario();
		return usuario ;
	}
    
 
}
