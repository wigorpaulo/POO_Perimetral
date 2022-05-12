package controller;

import java.util.ArrayList;

import model.Usuario;
import service.UsuarioService;

public class UsuarioController {
	
    public void cadastrar(Usuario usuario) {
		/*Ler arquivo passando o usuario*/
		UsuarioService usuarioService = new UsuarioService();
		usuarioService.ler(usuario);
		
	  /*	if (usuarioService.ler(usuario)) {
			System.out.println("Já possui Cadastro");
			return true;
		}
		else {
		    usuarioService.escrever(usuario);
		    System.out.println("Cadastro realizado com sucesso !");	
		    return false;
		} */
	}
	
	public void atualizar(Usuario usuario) {
		
	}
	
	public void deletar(Usuario usuario) {
		
	}
	
	public Usuario listar(String listar) {
		UsuarioService usuarioService = new UsuarioService();	
		return usuarioService.ler(listar);
	}
	
	   public  ArrayList<Usuario> listar() {	   
			ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();
			UsuarioService usuarioService = new UsuarioService();
			 
		    return usuarioService.ler();
	}

}
