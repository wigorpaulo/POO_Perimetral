package model;

public class Fornecedor {

	private int id ;
	private  String razaoSocial;
	private String fantasia;
	private String cnpj;
	private String tipoPessoa;

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
	public String getFantasia() {
		return fantasia;
	}
	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	@Override
	public String toString() {

		return  "ID: " + id +"  Razão Social: " + razaoSocial + " Fantasia: " + fantasia + " CNPJ " + cnpj + " Tipo Pessoa: " + tipoPessoa;
	}

	
}
