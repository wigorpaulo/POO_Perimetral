package controller;
import Service.ClienteService;
import Service.FornecedorService;
import Service.UsuarioService;
import java.util.Scanner;


public abstract class ControllGenerica {

    public UsuarioService userServ;
    public ClienteService clienteServ;
    public FornecedorService fornService;
    Scanner ler ;

    public ControllGenerica(){
        userServ = new UsuarioService();
        clienteServ = new ClienteService();
        fornService = new FornecedorService();
        Scanner ler = new Scanner(System.in);
    }
}
