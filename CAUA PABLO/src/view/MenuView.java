package view;
import java.util.Scanner;
public class MenuView {

    public void men(){
        Scanner ler = new Scanner (System.in);

        System.out.println("****BEM VINDO AO MENU****");
        System.out.println("____________________________________________");
        System.out.println(" 1-Cadastrar Usuario \n 2-Cadastrar Fornecedor \n 3-Cadastrar Tipo de Pessoa \n 4-Cadastrar Tipo \n 5-Cadastrar Cliente" +
                "\n 6-Cadastrar Produto \n 0-Sair");
        System.out.println("____________________________________________\n");
        System.out.println("Qual Opção Você Deseja?");
        int escolhaDoUsuario = ler.nextInt();

        if (escolhaDoUsuario == 1){
            System.out.println("Opção Escolhida: Cadastrar Usuario");
            UsuarioView user1 = new UsuarioView();
            user1.menuDoUsuario(null);
        }
        else if(escolhaDoUsuario == 2){
            System.out.println("Opção Escolhida: Cadastrar Fornecedor");
            UsuarioView user1 = new UsuarioView();
            user1.CadForn(null);

        }
        else if(escolhaDoUsuario == 3){
            System.out.println("Opção Escolhida: Cadastrar Tipo de Pessoa");
        }
        else if(escolhaDoUsuario == 4){
            System.out.println("Opção Escolhida: Cadastrar Tipo de");
        }
        else if(escolhaDoUsuario == 5){
            System.out.println("Opção Escolhida: Cadastrar Cliente");
        }
        else if(escolhaDoUsuario == 6){
            System.out.println("Opção Escolhida: Cadastrar Produto");
        }
        else if(escolhaDoUsuario == 0){
            System.out.println("Obrigado Por Utilizar Nossos Serviços!");

        }
        else if(escolhaDoUsuario > 7 || escolhaDoUsuario < 0){
            System.out.println("O Número Informado é Inválido!");
        }

    }






}
