package view;
import java.util.Scanner;
import model.TipoProduto;
public class TipoProdutoView {
Scanner ler = new Scanner(System.in);



    //___________________ETAPA DO TIPO DE PRODUTO___________________

    //MENU DE CADASTRO DO TIPO DE PESSOA
    public void CadTipoProd(TipoProduto produto) {
        int escolha;
        System.out.println("***BEM VINDO AO MENU DE CADASTRO DO TIPO DE PRODUTO***");
        System.out.println(" 1-Cadastrar \n 2-Listar Todos \n 5-Voltar Para O Menu \n");
        System.out.println("Escolha a Opção Desejada: ");
        escolha = ler.nextInt();

        if (escolha == 1) {
            CadTipoProd();
        }
        if (escolha == 2) {
            menuListarTipoProd(produto);
        }
        if (escolha == 5){
            MenuView men = new MenuView();
            men.men();
        }
    }

    //CADASTRO DO TIPO DE PRODUTO
    public void CadTipoProd() {
        TipoProduto tipoProd = new TipoProduto();

        System.out.println("***CADASTRO DO TIPO DE PRODUTO***\n");
        System.out.println("Informe o Id do Produto: ");
        tipoProd.setId(ler.nextInt());

        System.out.println("Informe a Descrição do Produto: ");
        tipoProd.setDescricao(ler.next());

        System.out.println("***CADASTRO REALIZADO***");
        System.out.println("***Seja Bem Vindo \n\n");
        CadTipoProd(tipoProd);
    }

    //MÉTODO DE LISTAR TIPO DE PRODUTO
    public void menuListarTipoProd(TipoProduto tipoProd) {
        System.out.println("***Bem Vindo a Lista do Tipo de Produto***");
        System.out.println("" + tipoProd.getId());
        System.out.println("" + tipoProd.getDescricao());
        CadTipoProd(null);
    }
}
