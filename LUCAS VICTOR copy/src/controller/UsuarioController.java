package controller;

import java.util.ArrayList;

import model.Usuario;
import service.UsuarioService;
import view.UsuarioView;

public class UsuarioController {
	
    public String cadastrar(Usuario usuario) {
		/*Ler arquivo passando o usuario*/	
		UsuarioService usuarioService = new UsuarioService();
		
	  	if (usuarioService.ler(usuario)) {
			return "Já possui Cadastro";
		}
		else {
			if (usuarioService.escrever(usuario)) {
				return "Cadastrado com sucesso!";
			} else {
				return "Tente novamente";
			}
			
		} 
	}
	
	public boolean atualizar(Usuario usuario) {
		
		UsuarioService usuarioService = new  UsuarioService();
		usuarioService.atualizar(usuario);
		
/*		if () {
			 return true;
		}else (){
			 return false;
		} */
		
	}
	
	public boolean deletar(Usuario usuario) {		
		UsuarioService usuarioService = new UsuarioService();
		return usuarioService.excluir(usuario);		
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
