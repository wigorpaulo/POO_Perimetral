package controller;
import java.util.Scanner;

import model.Usuario;

public class Main {
	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
		System.out.println("Login:\n");
		String login = in.nextLine();
		System.out.println("Senha: \n");
		String senha = in.nextLine();
		
		if(login.equals("admin") && senha.equals("123")){
			System.out.printf("Usuario %s logado com sucesso.\n", login);			
			
			int opc;
		String nome, senha2;
		Usuario novoUsuario = new Usuario();
		Listausuarios usuarioCadastrado = new Listausuarios();	
		Scanner teclado;		
		teclado = new Scanner(System.in);
		
		do {
			System.out.println("****Menu Usuario****\n");
			System.out.println("-\n");
			System.out.println("-1-Cadastrar\n");
			System.out.println("-2-Listar\n");
			System.out.println("-3-Atualizar\n");
			System.out.println("-4-Deletar\n");
			System.out.println("5-Voltar para login\n");
			System.out.println("-\n");
			System.out.println("********************");
			
			opc = teclado.nextInt();
			teclado.nextLine();
			
			switch( opc ) {
			case 1:
				System.out.println("\nLogin: ");
				nome = teclado.nextLine();
				System.out.println("\nSenha: ");
				senha2 = teclado.nextLine();		
				
			case 2:
				usuarioCadastrado.getListaUsuario();
				System.out.println(Listausuarios.get(in);
				
				break;
			case 3:
				
				break;
			case 4:
				break;
			case 5:
				break;
				
			default: 
				System.out.println("\nOp��o invalida!");
			}
		}while(opc != 0);
	}else {
		System.out.println("Login ou senha inv�lidos!");
	}
		
	}
 
}
