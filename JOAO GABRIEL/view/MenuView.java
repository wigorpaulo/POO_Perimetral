package view;
import java.util.Scanner;
import java.util.zip.Deflater;

import model.Usuario;
public class MenuView {


    Scanner ler = new Scanner(System.in);
    // Metodo


    public void menu() {
     
        System.out.println("");
        System.out.println("       Sejá Bem vindo ao menu principal ");
        System.out.println("");
        System.out.println("1 - Para cadastrar um usuario");
        System.out.println("2- Para se cadastrar um fornecador");
        System.out.println("3- cadastrar o tipo de pessoa");
        System.out.println("4- cadastrar um novo cliente");
        System.out.println("5- cadastrar um produto");
        System.out.println("6- para sair");
        System.out.println("");
         int x=ler.nextInt();
	    System.out.println("___________________________");

        

        switch(x){
            case 1 : 
            UsuarioView usuario =new UsuarioView();
            usuario.menuUsuario(null);
                 break;
            case 7: System.out.println("Programa finalizado!");
            break;
            default: System.out.println("Opção inválida");
            break;
        }
    }

}
