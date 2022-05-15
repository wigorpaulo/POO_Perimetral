package view;
import java.util.Scanner;
public class MenuView {

    public void men(){
        Scanner ler = new Scanner (System.in);

        System.out.println("****BEM VINDO AO MENU****");
        System.out.println("____________________________________________");
        System.out.println(" 1-Cadastrar Usuario \n " +
                "2-Cadastrar Fornecedor \n " +
                "3-Cadastrar Tipo de Pessoa \n " +
                "4-Cadastrar Tipo \n " +
                "5-Cadastrar Cliente" +
                "\n 6-Cadastrar Produto \n" +
                " 0-Sair\n");

        System.out.println("***Qual Opção Você Deseja?***");
        int escolhaDoUsuario = ler.nextInt();

        if (escolhaDoUsuario == 1){
            System.out.println("***Opção Escolhida: Cadastrar Usuario***");
            UsuarioView user1 = new UsuarioView();
            user1.menuDoUsuario(null);
        }

        else if(escolhaDoUsuario == 2){
            System.out.println("***Opção Escolhida: Cadastrar Fornecedor***");
            FornecedorView forn1 = new FornecedorView();
            forn1.CadForn(null);
        }

        else if(escolhaDoUsuario == 3){
            System.out.println("***Opção Escolhida: Cadastrar Tipo de Pessoa***");
            TipoPessoaView tipopessoa1 = new TipoPessoaView();
            tipopessoa1.CadTipoPessoa(null);
        }

        else if(escolhaDoUsuario == 4){
            System.out.println("***Opção Escolhida: Cadastrar Tipo de Produto***");
            TipoProdutoView tipoProd = new TipoProdutoView();
            tipoProd.CadTipoProd();
        }

        else if(escolhaDoUsuario == 5){
            System.out.println("***Opção Escolhida: Cadastrar Cliente***");
            ClienteView cli1 = new ClienteView();
            cli1.CadCliente(null);
        }

        else if(escolhaDoUsuario == 6){
            System.out.println("***Opção Escolhida: Cadastrar Produto***");
            ProdutoView prod1 = new ProdutoView();
            prod1.CadProduto(null);
        }

        else if(escolhaDoUsuario == 0){
            System.out.println("***Obrigado Por Utilizar Nossos Serviços!***");
        }

        else if(escolhaDoUsuario > 7 || escolhaDoUsuario < 0){
            System.out.println("***O Número Informado é Inválido!***");
        }
    }






}
