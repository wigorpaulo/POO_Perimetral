package view;
import java.util.Scanner;
import java.util.zip.Deflater;

import model.Usuario;
import model.Fornecedor;
public class MenuView {


    Scanner ler = new Scanner(System.in);
    // Metodo


    public void menu() {
    	
    	System.out.println("");
	    System.out.println("____________________________");
        System.out.println("        ***Menu***");
        System.out.println("");
        System.out.println("[1]-Cadastrar Usuario");
        System.out.println("[2]-Cadastrar Fornecedor");
        System.out.println("[3]-Castrar Tipo Pessoa");
        System.out.println("[5]-Cadastrar Cliente");
        System.out.println("[6]-Cadastrar Produto");
        System.out.println("[7]-Sair");
        System.out.println("");
         int x=ler.nextInt();
	    System.out.println("____________________________");
        
       
        switch(x){
            case 1 : 
            UsuarioView usuario =new UsuarioView();
            usuario.menuUsuario(null);
                 break;
            case 2:
            Fornecedor obj = new Fornecedor();
            obj.menuFornecedor(user: null);
                 break;     
            case 7: System.out.println("Programa finalizado!");
            break;
            default: System.out.println("Opcao invalida");
            break;
        }
    }

}
