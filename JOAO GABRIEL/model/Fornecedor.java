package model;

public class Fornecedor {

	private int id ;
	private  String razaoSocial;
	private String nfantasia;
	private String cnpj;
	private int tipoPessoa;
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
	public String getNfantasia() {
		return nfantasia;
	}
	public void setFantasia(String nfantasia) {
		this.nfantasia = nfantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public int getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(int tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	public Fornecedor(int id, String razaoSocial, String fantasia, String cnpj, int tipoPessoa) {
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.tipoPessoa = tipoPessoa;
	}
	
	
}
