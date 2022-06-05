package controller;
import model.Usuario;
import java.util.ArrayList;


public class UsuarioController extends ControllGenerica {


public String Cadastrar(Usuario user){
    if (userServ.ler(user)) {
        return "Usuario cadastrado";
    }
    if (userServ.esc(user)){
        return "Usuario Cadastro com Sucesso";
    }else{
        return "Tente Novamente";
    }
}


public ArrayList<Usuario> Listar(){

return  userServ.ler();

}
    public boolean Atualizar(Usuario usuario){
        return userServ.atualizar(usuario);
    }


public boolean Deletar(Usuario usuario){
    return userServ.Deletar(usuario);
}


}
