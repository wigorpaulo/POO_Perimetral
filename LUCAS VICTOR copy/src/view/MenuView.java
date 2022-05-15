package view;
import java.util.Scanner;
import java.util.zip.Deflater;

import model.Cliente;
import model.Fornecedor;
import model.Usuario;
import model.TipoPessoa;
import model.Produto;
public class MenuView {


    Scanner ler = new Scanner(System.in);
    // Metodo


    public void menu() {
    	
    	System.out.println("");
	    System.out.println("____________________________");
        System.out.println("        ***Menu***");
        System.out.println("");
        System.out.println("[1]-Cadastrar  Usuario");
        System.out.println("[2]-Cadastrar  Fornecedor");
        System.out.println("[3]-Casdastrar Tipo Pessoa");
        System.out.println("[4]-Cadastrar  Tipo Produto");
        System.out.println("[5]-Cadastrar  cliente");
        System.out.println("[6]-Cadastrar  Produto");
        System.out.println("[0]- Sair");
         int x=ler.nextInt();
	    System.out.println("____________________________");
        
       
        switch(x){
            case 1 :  UsuarioView usuario =new UsuarioView();
            		  usuario.menuUsuario(null); break;    
                  
            case 2 : FornecedorView fornecedor = new FornecedorView();
                     fornecedor.menuFornecedor(null); break;
                     
            case 3: TipoPessoaView tipoPessoa = new TipoPessoaView();
                    tipoPessoa.menuTipoPessoa(); break;
                    
            case 4: TipoProdutoView tipoProduto = new TipoProdutoView();
                    tipoProduto.menuTipoProduto(); break;
            	
            	
            case 5:ClienteView cliente = new ClienteView(); 
                  cliente.menuCliente(); break;
            
            case 6:	ProdutoView produto = new ProdutoView();
                    produto.menuProduto(null);break;
            	
            case 0: System.out.println("Programa finalizado!");
            break;
            default: System.out.println("Opcao invalida");
            break;
        }
    }

}
