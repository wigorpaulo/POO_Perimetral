package view;
import controller.UsuarioController;
import model.Usuario;
import java.util.Scanner;

public class UsuarioView {
    Scanner ler = new Scanner(System.in);
    
    //___________________ETAPA DO USUARIO___________________
    public void menuDoUsuario() {

        int escolha;
        System.out.println("***BEM VINDO AO MENU DO USUARIO***");
        System.out.println(" 1-Cadastrar \n 2-Listar Todos \n 3-Atualizar \n 4-Deletar \n 5-Voltar Para O Menu \n");
        System.out.println("Escolha a Opção Desejada: ");
        escolha = ler.nextInt();
        if (escolha == 1) {
            menuCadastro();
        }
        if (escolha == 2) {
            menuListar();
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
        menuDoUsuario();

        UsuarioController usercontrol = new UsuarioController();
        usercontrol.Cadastrar(username);




    }

    //MÉTODO DE LISTAR
    public void menuListar() {

        UsuarioController usercontroll = new UsuarioController();
        usercontroll.Listar();

        System.out.println("Não posssui usuario cadastrado");




    }

    public void menuAtualizar(){
Scanner ler = new Scanner(System.in);
        Usuario username = new Usuario();

        System.out.println("ATUALIZAÇÃO DO USUARIO");

        System.out.println("***CADASTRO DO USUARIO***");
        System.out.println("Informe seu Usuario: ");
        username.setUsername(ler.next());

        System.out.println("Informe sua Senha: ");
        username.setPassword(ler.next());

        UsuarioController usercontrol = new UsuarioController();
        if (! usercontrol.Atualizar(username)){
            System.out.println("Usuario não encontrado");
        }else{
            System.out.println("Usuario Atualizado");
        }



    }

public void menuDeletar(){
        Scanner ler = new Scanner(System.in);
        Usuario usuario = new Usuario();

    System.out.println("***CADASTRO DO USUARIO***");
    System.out.println("Informe seu Usuario: ");
    usuario.setUsername(ler.next());

    System.out.println("Informe sua Senha: ");
    usuario.setPassword(ler.next());

    UsuarioController usercontrol = new UsuarioController();
    if(!usercontrol.Deletar(usuario)){
        System.out.println("Usuário não encontrado");
    }else{
        System.out.println("Usuário excluido com Sucesso!!");

    }
}

}
