package Model;

public class Fornecedor {
	
	private int id, tipo_pessoaId;
	private String razaoSocial,Cnpj,Fantasia_social;
	
	
	public int getTipo_pessoaId() {
		return tipo_pessoaId;
	}
	public void setTipo_pessoaId(int tipo_pessoaId) {
		this.tipo_pessoaId = tipo_pessoaId;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return Cnpj;
	}
	public void setCnpj(String cnpj) {
		this.Cnpj = cnpj;
	}
	public String getFantasia_social() {
		return Fantasia_social;
	}
	public void setFantasia_social(String fantasia_social) {
		this.Fantasia_social = fantasia_social;
	}
	public int getId() {
		return id;
	}
	public void setId(int id){
		this.id = id;
		
	}
	

}
