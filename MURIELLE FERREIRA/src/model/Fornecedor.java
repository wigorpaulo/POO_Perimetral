package model;

public class Fornecedor {
	private int id;
	private String razaoSocial;
	private String cnpj;
	private int tipopessoaid;
	private String fantasia;

	

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;

	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;

	}

	public String getCnpj() {
		return cnpj;
	}

	public void setTipopessoaid(int tipopessoaid) {
		this.tipopessoaid = tipopessoaid;

	}

	public float getTipopessoaid() {
		return tipopessoaid;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;

	}

	public String getFantasia() {
		return fantasia;
	}

}
