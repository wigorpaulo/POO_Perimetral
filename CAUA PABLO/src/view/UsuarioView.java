package view;
import model.Fornecedor;
import model.Usuario;
import java.util.Scanner;

public class UsuarioView {
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


    //___________________ETAPA DO USUARIO___________________
    public void menuDoUsuario(Usuario username) {

        int escolha;
        System.out.println("***BEM VINDO AO MENU DO USUARIO***");
        System.out.println(" 1-Cadastrar \n 2-Listar Todos \n 3-Atualizar \n 4-Deletar \n 5-Voltar Para O Menu \n");
        System.out.println("Escolha a Opção Desejada: ");
        escolha = ler.nextInt();
        if (escolha == 1) {
            menuCadastro();
        }
        if (escolha == 2) {
            menuListar(username);
        }
        if (escolha == 5){
            MenuView men = new MenuView();
            men.men();
        }
    }

    //MÉTODO DE CADASTRO DO USUARIO
    public void menuCadastro() {
        Usuario username = new Usuario();

        System.out.println("***CADASTRO DO USUARIO***");
        System.out.println("Informe seu Usuario: ");
        username.setUsername(ler.next());

        System.out.println("Informe sua Senha: ");
        username.setPassword(ler.next());

        System.out.println("***CADASTRO REALIZADO***");
        System.out.println("***Seja Bem Vindo \n\n");
        menuDoUsuario(username);
    }

    //MÉTODO DE LISTAR
    public void menuListar(Usuario username) {
        System.out.println("***Bem Vindo a Lista do Usuário***");
        System.out.println("" + username.getUsername());
        System.out.println("" + username.getPassword());
        menuDoUsuario(null);
    }
}
