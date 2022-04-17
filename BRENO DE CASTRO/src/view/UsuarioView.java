package view;

import java.util.Scanner;

import model.Usuario;

public class UsuarioView {
	
	private int option;
	
	Scanner ler = new Scanner(System.in);
	
	public void cadastro() {
		
		Scanner ler = new Scanner(System.in);
		Usuario user = new Usuario();
		
		System.out.println("-> CADASTRO <-\n");
		System.out.println("-> Digite o username:");
		user.setUsername(ler.next());
		System.out.println("-> Digite o password: ");
		user.setPassword(ler.next());
		System.out.println("**** CADASTRADO COM SUCESSO ****\n");
		
		menuUsuario(user);
		
	}
	
public void listar(Usuario user) {
		
		System.out.println(" _____________________________");
		System.out.println("|      LISTA DE CADASTRO      |");
		System.out.println("|_____________________________|");
		System.out.println(" ===> Username: " + user.getUsername());
		System.out.println(" ===> Password: " + user.getPassword());
		System.out.println("\n");
		
		menuUsuario(null);
		
	}
	
	public void menuUsuario(Usuario user) {
		
		System.out.println(" ____________________________");
		System.out.println("|        MENU USUARIO        |");
		System.out.println("|____________________________|");
		System.out.println("|  (1)-> Cadastrar           |");
		System.out.println("|  (2)-> Listar              |");
		System.out.println("|  (3)-> Atualizar           |");
		System.out.println("|  (4)-> Deletar             |");
		System.out.println("|  (5)-> Voltar para o Menu  |");
		System.out.println("|____________________________|");
		
	Scanner ler = new Scanner(System.in);
	option = ler.nextInt();
	
	switch(option) {
		case 5:
			MenuView MenuView = new MenuView();
			MenuView.menu();
			
		case 1: 
			cadastro();
		case 2:
			listar(user);
			
		}
	}
}