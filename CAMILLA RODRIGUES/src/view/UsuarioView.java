package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Usuario;
import service.UsuarioService;

public class UsuarioView {

	public void menuUsuario() {

		System.out.println("* * * Menu Usuário * * *\n");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Listar Todos");
		System.out.println("3 - Atualizar");
		System.out.println("4 - Deletar");
		System.out.println("5 - Voltar para Menu");
		System.out.println("\n* * * * * *");

	}

	public void menuCadastro() {
		UsuarioService buscarCadastro = new UsuarioService();
		buscarCadastro.criarArquivo();
		String caminho = "User.txt";
		Scanner scUser = new Scanner(System.in);
		Usuario user = new Usuario();
		System.out.println("* * * Cadastro Usuário * * *");
		System.out.print("Informe Username: ");	
		user.setUsername(scUser.nextLine().toUpperCase());		
		if(buscarCadastro.buscarUsername(user.getUsername(), caminho)==true) {
			System.out.println("Usuário já possui cadastro.\n");	
		}
		else {
			System.out.print("Informe Password: ");
			user.setPassword(scUser.nextLine());
			buscarCadastro.inserir(caminho, user);
			System.out.println("Cadastro Realizado!!!\n");
		}
			
	}

	public void menuListar() {
		UsuarioService listarUsuarios = new UsuarioService();
		listarUsuarios.criarArquivo();
		String caminhoUsuarios = "User.txt";
		listarUsuarios.listarUsuarios(caminhoUsuarios);
		
	}

	public void menuAtualizar() {
		UsuarioService alterarUsuario = new UsuarioService();
		alterarUsuario.criarArquivo();
		String caminho = "User.txt";
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe o nome do usuário que deseja alterar: ");
		String nome = ler.nextLine().toUpperCase();
		System.out.print("Senha atual: ");
		String senha=ler.nextLine();
		
		if(alterarUsuario.validarUserSenha(nome, senha, caminho)==true) {
			alterarUsuario.alterarUsuario(nome, senha, caminho);			
		}
	}

	public void menuDeletar() {
		UsuarioService deletarUsuario = new UsuarioService();
		deletarUsuario.criarArquivo();
		String caminho = "User.txt";
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe o nome do usuário que deseja deletar: ");
		String nome = ler.nextLine().toUpperCase();
		System.out.print("Senha: ");
		String senha=ler.nextLine();

		deletarUsuario.validarUserSenha(nome, senha, caminho);
		if(deletarUsuario.validarUserSenha(nome, senha, caminho)==true) {
			deletarUsuario.deletarUsuario(nome, caminho);
			
		}
	}
}


