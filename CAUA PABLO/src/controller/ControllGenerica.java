package controller;
import Service.UsuarioService;
public abstract class ControllGenerica {

    public UsuarioService userServ;

    public ControllGenerica(){
        userServ = new UsuarioService();
    }
}
