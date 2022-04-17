package Model;

public class Fornecedor {

	public int id;
	public String razaoSocial;
	public String cnpj;
	public int tipoPessoaId;
	public String fantasia;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getrazaoSocial() {
		return razaoSocial;
	}
	public void setrazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;	
	}
	public String getcnpj() {
		return cnpj;
	}
	public void setcnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getfantasia() {
		return fantasia;
	}
	public void setfantasia(String fantasia) {
		this.fantasia = fantasia;
	}
	
}
