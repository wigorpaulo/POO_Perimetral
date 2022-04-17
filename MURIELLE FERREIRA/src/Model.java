import java.util.Scanner;
import model.Fornecedor;

public class Model {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fornecedor forn1 = new Fornecedor();
		String razaoSocial;
		String fantasia;
		int tipopessoaid;
		int id;
		String cnpj;

		System.out.print("Informe um código: ");
		id = sc.nextInt();
		forn1.setId(id);
		sc.nextLine();

		System.out.print("Informe o nome fantasia: ");
		fantasia = sc.nextLine();
		forn1.setFantasia(fantasia);

		System.out.print("Informe a razão social: ");
		razaoSocial = sc.nextLine();
		forn1.setRazaoSocial(razaoSocial);

		System.out.print("Informe um cnpj: ");
		cnpj = sc.nextLine();
		forn1.setCnpj(cnpj);

		System.out.print("Informe 1-Pessoa física, 2- pessoa jurídica: ");
		tipopessoaid = sc.nextInt();
		forn1.setTipopessoaid(tipopessoaid);
		sc.nextLine();

		System.out.println();
		System.out.println("**********************************");
		System.out.println("DADOS");
		System.out.println("Código: " + forn1.getId());
		System.out.println("Fantasia: " + forn1.getFantasia());
		System.out.println("Razão social: " + forn1.getRazaoSocial().toUpperCase());
		System.out.println("Cnpj: " + forn1.getCnpj());
		System.out.println("Tipo de pessoa: " + forn1.getTipopessoaid());
		System.out.println();
		System.out.println("**************LOGIN**************");
		System.out.println();	
		System.out.print("Informe um nome: ");
		String nome = sc.nextLine();
		System.out.print("Informe uma senha: ");
		String senha = sc.nextLine();
		System.out.println();
		System.out.println("********LOGADO COM SUCESSO********");

		sc.close();
	}

}
