package Model;

public class Fornecedor {
	
	private int id;
	private String razaoSocial;
	private String cnpj;
	private String tipoPessoaId;
	private String fantasia;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getTipoPessoaId() {
		return tipoPessoaId;
	}
	public void setTipoPessoaId(String tipoPessoaId) {
		this.tipoPessoaId = tipoPessoaId;
	}
	
	public String getFantasia() {
		return fantasia;
	}
	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}
	
}