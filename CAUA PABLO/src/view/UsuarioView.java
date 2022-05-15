package view;
import model.Usuario;
import java.util.Scanner;

public class UsuarioView {
    Scanner ler = new Scanner(System.in);
    
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
