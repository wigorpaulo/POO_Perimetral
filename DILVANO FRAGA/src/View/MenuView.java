package View;

import java.util.Scanner;
import View.UsuarioView;
import Model.Usuario;
import Model.Fornecedor;
import Model.Produto;
import Model.TipoPessoa;
import Model.TipoProduto;

public class MenuView {
    public void menu(){
        Scanner ler = new Scanner(System.in);

        System.out.println("***Menu***");
        System.out.println("-");
        System.out.println("-1-Cadastrar Usuario: ");
        System.out.println("-2-Cadastrar Fornecedor: ");
        System.out.println("-3-Cadastrar Tipo Pessoa: ");
        System.out.println("-4-Cadastrar Tipo Produto: ");
        System.out.println("-5-Cadastrar Cliente: ");
        System.out.println("-6-Cadastrar Produto: ");
        System.out.println("-0-Sair");
        System.out.println("-");
        System.out.println("*******");

        int num = ler.nextInt();

        if(num == 1){
            UsuarioView user = new UsuarioView();
            user.menuUsuario(null);
        }else{
            System.out.println("***Programa encerrado!***");
        }
    }

}
