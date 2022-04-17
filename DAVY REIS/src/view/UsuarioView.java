package view;

import java.util.Scanner;

import model.Usuario;

public class UsuarioView {

    MenuView menu = new MenuView();


    public void menuUsuario() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("**************MENU DO USUÁRIO*************");
        System.out.println("1-Cadastrar Usuário");
        System.out.println("2-Listar Pessoa");
        System.out.println("3-Atualizar");
        System.out.println("4-Deletar");
        System.out.println("5-Voltar Para Menu");

        int opcao = entrada.nextInt();

        switch (opcao) {

            case 1:
                menuCadastro();
                break;
           /*
            case 2:
                menuListar();
                break;
                Não consegui implementar o método.
            */

            case 5:
                menu.menu();
                break;

            default:
                System.out.println("Digite uma opção válida!!!\n");
                menuUsuario();
                break;
        }

    }


    public void menuCadastro() {
        Scanner entrada = new Scanner(System.in);

        Usuario user = new Usuario();

        System.out.println("**************CADASTRO USUÁRIO*************");
        System.out.println("INFORME O USERNAME: ");
        user.setUsername(entrada.next());
        System.out.println("INFORME O PASSWORD: ");
        user.setPassword(entrada.next());
        System.out.println("****** CADASTRO REALIZADO!!!******");

        menu.menu();

    }

    public void menuListar(Usuario user) {

        System.out.println("**************LISTA USUÁRIO*************");
        System.out.println("O USERNAME: " + user.getUsername());
        System.out.println("O PASSWORD: " + user.getPassword());


    }

}
