package view;
import java.util.Scanner;
import model.TipoPessoa;
public class TipoPessoaView {
Scanner ler = new Scanner(System.in);

    //___________________ETAPA DE TIPO DE PESSOA___________________

    //MENU DE CADASTRO DO TIPO DE PESSOA
    public void CadTipoPessoa(TipoPessoa pessoa) {
        int escolha;
        System.out.println("***BEM VINDO AO MENU DE CADASTRO DO TIPO DE PESSOA***");
        System.out.println(" 1-Cadastrar \n 2-Listar Todos \n 5-Voltar Para O Menu \n");
        System.out.println("Escolha a Opção Desejada: ");
        escolha = ler.nextInt();

        if (escolha == 1) {
            CadTipoPessoa();
        }
        if (escolha == 2) {
            MenuTipoPessoa(pessoa);
        }
        if (escolha == 5){
            MenuView men = new MenuView();
            men.men();
        }
    }

    //CADASTRO DO TIPO DE PESSOA
    public void CadTipoPessoa() {
        TipoPessoa pessoa = new TipoPessoa();

        System.out.println("***CADASTRO DO TIPO DE PESSOA***");
        System.out.println("Informe o Id Desejado: ");
        pessoa.setId(ler.nextInt());

        System.out.println("Informe a Descrição: ");
        pessoa.setDescricao(ler.next());

        System.out.println("***CADASTRO REALIZADO***");
        System.out.println("***Seja Bem Vindo \n\n");
        CadTipoPessoa(pessoa);
    }

    //MÉTODO DE LISTAR LISTAR TIPO DE PESSOA
    public void MenuTipoPessoa(TipoPessoa pessoa) {
        System.out.println("***Bem Vindo a Lista do Usuário***");
        System.out.println("" + pessoa.getId());
        System.out.println("" + pessoa.getDescricao());
        CadTipoPessoa(null);
    }

}
