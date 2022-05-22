package controller;

import java.util.ArrayList;

import model.Usuario;
import service.UsuarioService;
import view.UsuarioView;

public class UsuarioController {
	
    public String cadastrar(Usuario usuario) {
		/*Ler arquivo passando o usuario*/	
		UsuarioService usuarioService = new UsuarioService();
		
		boolean retorno = usuarioService.lerArquivo(usuario);

	  	if (retorno) {
			return "Ja possui Cadastro";
		}
		else {
			if (usuarioService.escreverArquivo(usuario)) {
				return " Cadastrado com sucesso!";
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
	
	public boolean excluir(Usuario usuario) {		
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
