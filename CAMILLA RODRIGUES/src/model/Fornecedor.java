package model;

public class Fornecedor {

	private Integer id;
	private String razaoSocial;
	private String cnpj;
	private Integer tipoPessoa;
	private String fantasia;

	public Fornecedor() {

	}

	public Fornecedor(Integer id, String razaoSocial, String cnpj, Integer tipoPessoa, String fantasia) {
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.tipoPessoa = tipoPessoa;
		this.fantasia = fantasia;
	}

	public Integer getId() {
		return id;
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

	public Integer getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(Integer tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}

	@Override
	public String toString() {
		if (tipoPessoa == 1) {
			return "Cód. Fornecedor: " + id +  "\tTipo: PF\tCPF: " + cnpj 
					+ "\nRazão Social: " + razaoSocial  + "\nFantasia: " + fantasia + "\n";
		} else {
			return "Cód. Fornecedor: " + id  + "\tTipo: PJ\tCNPJ: " + cnpj 
					+ "\nRazão Social: " + razaoSocial+ "\nFantasia: " + fantasia + "\n";
		}
	}

}

