package view;
import model.Fornecedor;
import model.Produto;

import java.util.Scanner;
public class ProdutoView {
Scanner ler = new Scanner(System.in);


    //___________________ETAPA DE CADASTRO DO  PRODUTO___________________
    //MENU DE CADASTRO DO PRODUTO
    public void CadProduto(Produto produto) {
        int escolha;
        System.out.println("***BEM VINDO AO MENU DE CADASTRO DE PRODUTO***");
        System.out.println(" 1-Cadastrar \n 2-Listar Todos \n 5-Voltar Para O Menu \n");
        System.out.println("Escolha a Opção Desejada: \n");
        escolha = ler.nextInt();

        if (escolha == 1) {
            menuCadastroProduto();
        }
        if (escolha == 2) {
            menuListarProduto(produto);
        }
        if (escolha == 5){
            MenuView men = new MenuView();
            men.men();
        }
    }

    //CADASTRO DO PRODUTO
    public void menuCadastroProduto() {
        Produto produto = new Produto();

        System.out.println("***CADASTRO DO PRODUTO***");
        System.out.println("Informe o Produto que Deseja Adicionar: ");
        produto.setCodigo(ler.next());

        System.out.println("Informe a Marca do Produto: ");
        produto.setMarca(ler.next());

        System.out.println("Informe a Descrição Do Produto: ");
        produto.setDescricao(ler.next());

        System.out.println("Informe a Cor do Produto: ");
        produto.setCor(ler.next());

        System.out.println("Informe o Código do Produto: ");
        produto.setCodigo(ler.next());

       // System.out.println("Informe a Data de Validade: ");
        //produto.setDataValidade(ler.nextDate());

        System.out.println("Informe o Valor de Venda do Produto: ");
        produto.setPreco_venda(ler.nextFloat());

        System.out.println("Informe o Valor de Compra do Produto: ");
        produto.setPrecoVenda(ler.nextFloat());

        System.out.println("***CADASTRO DO PRODUTO REALIZADO***\n");
        CadProduto(produto);
    }

    //MÉTODO DE LISTAR PRODUTOS
    public void menuListarProduto(Produto produto) {
        System.out.println("***Bem Vindo a Lista do Usuário***");
        System.out.println("" + produto.getCodigo());
        System.out.println("" + produto.getDescricao());
        CadProduto(null);
    }







}
