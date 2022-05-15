package controller;
import java.util.ArrayList;

import model.Usuario;
import service.UsuarioService;

public class UsuarioController {

	
	public boolean cadastrar(Usuario usuario){
		 UsuarioService usuarioService = new UsuarioService();
		  
		 if (usuarioService.ler(usuario)) {	 
          System.out.println("Já possui Cadastro");
	         return true;
	       }
		 else {
		  usuarioService.escrever(usuario);	 
		  System.out.println("Cadastro realizado com sucesso!");
	         return false;
	       }	
	}
	
	public void atualizar(Usuario usuario) {
		
	}
	
	public void deletar(Usuario usuario) {
		
	}
	
	public Usuario listar(String listar) {
		Usuario usuario = new Usuario();
		
		UsuarioService usuarioService = new UsuarioService();
		return usuarioService.ler(listar);
		
	}
	
	public ArrayList<Usuario> listar(){
		
		ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();
		
		UsuarioService usuarioService = new UsuarioService();
		
		return usuarioService.ler();
	}


}
