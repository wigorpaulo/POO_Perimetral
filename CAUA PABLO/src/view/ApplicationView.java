package view;
import controller.ClienteController;
import controller.FornecedorController;
import controller.UsuarioController;
import java.util.Scanner;

public abstract class ApplicationView {

    UsuarioController usercontrol;
    ClienteController clienteController;
    FornecedorController fornecedorController;
    Scanner ler;

    public ApplicationView(){
        fornecedorController = new FornecedorController();
        usercontrol = new UsuarioController();
        clienteController = new ClienteController();
        ler = new Scanner(System.in);
    }
}

