package service;

import java.util.ArrayList;

import model.Usuario;

public class UsuarioService {

    public boolean escrever(Usuario usuario) {
        return true;
    }

    public boolean ler(Usuario usuario) {
        return true;
    }

    public ArrayList<Usuario> ler() {
        ArrayList usuarios = new ArrayList<>();
        return usuarios;
    }

    public boolean atualizar(Usuario usuario) {
        if (existiArquivo()) {
        } else {
           return false;
        }
        return true;
    }

    public boolean excluir(Usuario usuario) {
        if (existiArquivo()) {
             ler(usuario); 

        }else{
            return false;  
        }
        return true;
    }

    private boolean existiArquivo() {
        return true;
    }

    private boolean criarArquivo() {
        return true;
    }
}
