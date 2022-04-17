package view;

import java.util.Scanner;

public class Menu {
	
	public static void Menu(){
		System.out.println("****Menu Usuario****\n");
		System.out.println("-\n");
		System.out.println("-1-Cadastrar\n");
		System.out.println("-2-Listar\n");
		System.out.println("-3-Atualizar\n");
		System.out.println("-4-Deletar\n");
		System.out.println("5-Voltar para menu\n");
		System.out.println("-\n");
		System.out.println("********************");
	}
	
	

	public static void main(String[] args) {
	
		int opção = 0;
		Scanner Ler = new Scanner(System.in);
					
		Menu();
		opção = Ler.nextInt();
		
		switch(opção) {
		case 1 :
			Cadastro();
			break;
		case 2 :
			Listar();
			break;
		case 3 :
			Atualizar();
			break;
		case 4 :
			Deletar();
			break;
		case 5 :
			Voltar();
			break;
			
			default:
				System.out.println("Opção invalida, tente novamente!");
		}

	}



	private static void Voltar() {
		// TODO Auto-generated method stub
		
	}



	private static void Deletar() {
		// TODO Auto-generated method stub
		
	}



	private static void Atualizar() {
		// TODO Auto-generated method stub
		
	}



	private static void Listar() {
		// TODO Auto-generated method stub
		
	}



	private static void Cadastro() {
		// TODO Auto-generated method stub
		
	}


}
