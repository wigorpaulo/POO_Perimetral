package view;

import java.util.Scanner;

public class MenuView {

	public void menu() {
		

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("******MENU******");
		System.out.println("1 - CADASTRAR USUARIO");
		System.out.println("2 - CADASTRAR FORNECEDOR");
		System.out.println("3 - CADASTRAR TIPO PESSOA");	
		System.out.println("4 - CADASTRAR TIPO PRODUTO");
		System.out.println("5 - CADASTRAR CLIENTE");
		System.out.println("6 - CADASTRAR PRODUTO");
		System.out.println("0 - SAIR");
		System.out.println("***************");
		
		UsuarioView usuario = new UsuarioView();	
		usuario.usuario();
		
	}
}