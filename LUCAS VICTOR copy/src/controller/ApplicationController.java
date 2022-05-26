package controller;

import service.UsuarioService;

public abstract class ApplicationController {
    
    public UsuarioService usuarioService;

    public ApplicationController(){
        usuarioService = new UsuarioService(); 
    }

}
