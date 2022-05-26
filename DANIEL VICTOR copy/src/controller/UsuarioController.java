package controller;

import java.util.ArrayList;

import model.Usuario;
import service.UsuarioService;

public class UsuarioController {

    public String cadastrar(Usuario usuario) {

        UsuarioService usuarioService = new UsuarioService();
      
        // Irá verificar se ja possui registro de Usuario!
        if (usuarioService.ler(usuario)) {
            return "Usuario já cadastrado!";
        } else {
            // Escrever no arquivo
            if (usuarioService.escrever(usuario)) {
                return "Usuario Cadastrado com sucesso!";
            } else {
                return "Falha na escrita \n Tente novamente!";
            }

        }

    }



    public ArrayList<Usuario> listar() {
       ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();
       UsuarioService usuarioService = new UsuarioService();
         return  usuarioService.ler();
    }

    public boolean atualizar(Usuario usuario) {
        UsuarioService usuarioService = new UsuarioService();
        return usuarioService.atualizar(usuario);
        
    }

    public boolean excluir(Usuario usuario){
        UsuarioService usuarioService = new UsuarioService();
        return usuarioService.excluir(usuario);
        
    }

}
