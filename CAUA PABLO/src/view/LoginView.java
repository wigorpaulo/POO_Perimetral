package view;
import java.util.Scanner;
import view.MenuView;
public class LoginView {

    //INSTANCIAÇÃO DO METODO INICIO DO LOGIN;
    public void inicio(){
        Scanner ler = new Scanner (System.in);

        System.out.println("");
        System.out.print("***Bem Vindo***\n");
        System.out.println("Digite seu Usuário: ");
        String user = ler.next();

        System.out.println("Digite sua Senha: ");
        String passw = ler.next();

        System.out.println("***LOGADO COM SUCESSO***");
        System.out.println("Seja Bem Vindo"+user);

        MenuView men1 = new MenuView();
        men1.men();

    }






}







