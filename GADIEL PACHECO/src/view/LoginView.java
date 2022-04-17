package view;
import java.util.Scanner;

public class LoginView extends model.Usuario{
    public void login() {
    	Scanner ler = new Scanner(System.in);
    	String useName;
    	String password;
		System.out.println("\n\n******* Login ****************\n");
		System.out.print("Usuario: ");
		useName = ler.nextLine();
		System.out.print("Senha: ");
		password = ler.nextLine();
		System.out.println("\n***** Logado com Sucesso! ****");
		
		MenuView obj = new MenuView();
		obj.menu();
    }
}
