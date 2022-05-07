package view;

import java.util.Scanner;
import model.TipoPessoa;
import model.Usuario;

public class TipoPessoaView {
	public void menuTipoPessoa(TipoPessoa tipoPessoa){
	Scanner ler =new Scanner(System.in);

    System.out.println("");
    System.out.println("____________________________");
	System.out.println("  *** Menu de Usuario ***");
	System.out.println("");
	System.out.println("[1]- Cadastrar");
	System.out.println("[2]- Listar Todos");
	System.out.println("[3]- Atualizar");
	System.out.println("[4]- Deletar");
	System.out.println("[5]- Voltar para o Menu");
	System.out.println("");
	int x=ler.nextInt();
	System.out.println("____________________________");
    System.out.println("");
	
	

	switch(x){
		case 1 : menuCadastro();break;
		case 2 : menuListar(tipoPessoa);break;
		case 3 : menuAtualizar(tipoPessoa);break;
		case 4 : menuDeletar(tipoPessoa);break;
		case 5 : MenuView menu = new MenuView();
		         menu.menu();break;
		default: System.out.println("Opcao invalida !");break;
	}


}

public void menuCadastro() {
	
	Scanner ler = new Scanner(System.in);
	
	TipoPessoa tipoPessoa= new TipoPessoa();
	
	System.out.println("");
    System.out.println("______________________________");
	System.out.println(" *** Tipo Pessoa de Usuario ***");
	System.out.println(" ");
	System.out.print("Informe id :");
	tipoPessoa.setId(ler.nextInt());
	System.out.print("Informe o Nome  :");
	tipoPessoa.setNome(ler.nextLine());
	System.out.print("Informe o Tipo Pessoa  :");
	tipoPessoa.setTipo(ler.next());
	System.out.println("");
	System.out.println(" *** Cadastro Realizado! ***");
	System.out.println("______________________________");
    System.out.println("");

		
	menuTipoPessoa(tipoPessoa);
}
public void menuListar(TipoPessoa tipoPessoa) {
	
	System.out.println("");
    System.out.println("__________________________________");
    System.out.println("  *** Tipo Pessoa Cadastrados  ***");
    System.out.println("");
	System.out.println("id:" + tipoPessoa.getId() );
	System.out.println("Nome: "+ tipoPessoa.getNome());
	System.out.println("Tipo Pessoa: "+ tipoPessoa.getTipo());
	System.out.println("");
	System.out.println("__________________________________");
	System.out.println("");
	
	menuTipoPessoa(null);
}



public void menuAtualizar(TipoPessoa tipoPessoa) {
	Scanner ler = new Scanner(System.in);

	System.out.println("");
    System.out.println("__________________________________");
    System.out.println("Atualizando id :");
    tipoPessoa.setId(ler.nextInt());
    System.out.println("Atualizando nome :");
	tipoPessoa.setNome(ler.next());
	System.out.println("Atualizando Tipo Pessoa :");
	tipoPessoa.setTipo(ler.nextLine());		
	System.out.println("Atualizado com sucesso !!!");
	System.out.println("");
    System.out.println("__________________________________");
    
	menuTipoPessoa(tipoPessoa);
}

public void menuDeletar(TipoPessoa tipoPessoa) {
    System.out.println("");
    System.out.println("__________________________________");
    System.out.println("");
	System.out.println("Cadastro deletado com sucesso !!! ");
	System.out.println("");
    System.out.println("__________________________________");
    tipoPessoa.setId(0);
    tipoPessoa.setNome(null);
    tipoPessoa.setTipo(null);
    menuTipoPessoa(tipoPessoa);
}
}

