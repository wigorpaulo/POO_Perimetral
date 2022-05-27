package view;

import java.time.Year;
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
          System.out.println("[4]-Castrar Tipo Produto");
          System.out.println("[5]-Cadastrar Cliente");
          System.out.println("[6]-Cadastrar Produto");
          System.out.println("[7]-Sair");
          System.out.println("");
          int x = ler.nextInt();
          System.out.println("____________________________");

          switch (x) {
               case 1:
                    UsuarioView usuario = new UsuarioView();
                    usuario.menuUsuario();
                    break;
               case 2:
                    FornecedorView fornecedor = new FornecedorView();
                    fornecedor.menuFornecedor();
                    break;
               case 3:
                    TipoPessoaView tipoPessoa = new TipoPessoaView();
                    tipoPessoa.menuTipoPessoa(null);
                    break;
               case 4:
                    TipoProdutoView tipoProduto = new TipoProdutoView();
                    tipoProduto.menuTipoProduto(null);
                    break;
               case 5:
                    ClienteView cliente = new ClienteView();
                    cliente.menuCliente();
                    break;
               case 6:
                    ProdutoView produto = new ProdutoView();
                    produto.menuProduto(null);
                    break;
               case 7:
                    System.out.println("Programa finalizado!");
                    System.exit(0);
                    break;
               default:
                    System.out.println("Opcao invalida");
                    menu();
                    break;
          }
     }

}
