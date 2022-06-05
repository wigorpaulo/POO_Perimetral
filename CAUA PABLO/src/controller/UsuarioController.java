package controller;
import Service.UsuarioService;
import model.Usuario;

import java.util.ArrayList;

public class UsuarioController {



public String Cadastrar(Usuario user){
    UsuarioService userserv = new UsuarioService();

    if (userserv.ler(user)) {
        return "Usuario cadastrado";
    }
    if (userserv.esc(user)){
        return "Usuario Cadastro com Sucesso";
    }else{
        return "Tente Novamente";
    }
}






public ArrayList<Usuario> Listar(){

UsuarioService userService = new UsuarioService();
return  userService.ler();

}
    public boolean Atualizar(Usuario usuario){
        UsuarioService userService = new UsuarioService();
        return userService.atualizar(usuario);
    }


public boolean Deletar(Usuario usuario){
    UsuarioService userService = new UsuarioService();
    return userService.excluir(usuario);
}


}
