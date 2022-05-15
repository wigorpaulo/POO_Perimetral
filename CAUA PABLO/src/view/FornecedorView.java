package view;
import java.util.Scanner;
import model.Fornecedor;
public class FornecedorView {
Scanner ler = new Scanner(System.in);

    //___________________ETAPA DO FORNECEDOR___________________
    //MENU DE CADASTRO DO FORNECEDOR
    public void CadForn(Fornecedor fornecedor) {
        int escolha;
        System.out.println("***BEM VINDO AO MENU DE CADASTRO DO FORNECEDOR***");
        System.out.println(" 1-Cadastrar \n 2-Listar Todos \n 5-Voltar Para O Menu \n");
        System.out.println("Escolha a Opção Desejada: ");
        escolha = ler.nextInt();
        if (escolha == 1) {
            menuCadastroForn();
        }
        if (escolha == 2) {
            menuListarForn(fornecedor);
        }
        if (escolha == 5){
            MenuView men = new MenuView();
            men.men();
        }
    }

    //CADASTRO DO FORNECEDOR
    public void menuCadastroForn() {
        Fornecedor fornecedor = new Fornecedor();

        System.out.println("***CADASTRO DO FORNECEDOR***");
        System.out.println("Informe a Fantasia da empresa: ");
        fornecedor.setFantasia(ler.next());

        System.out.println("Informe seu Cnpj: ");
        fornecedor.setCnpj(ler.next());

        System.out.println("***CADASTRO REALIZADO***");
        System.out.println("***Seja Bem Vindo \n\n");
        CadForn(fornecedor);
    }

    //MÉTODO DE LISTAR FORNECEDOR
    public void menuListarForn(Fornecedor fornecedor) {
        System.out.println("***Bem Vindo a Lista do Usuário***");
        System.out.println("" + fornecedor.getFantasia());
        System.out.println("" + fornecedor.getCnpj());
        CadForn(null);
    }

}
