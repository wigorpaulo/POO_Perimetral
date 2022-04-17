package model;
public class Fornecedor {

    private int id;
    private String razaoSocial;
    private String cnpj;
    private int TipoPessoaid;
    private String fantasia;

    //GET
    public int getId() {
        return id;
    }

    public int getTipoPessoaid() {
        return TipoPessoaid;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getFantasia() {
        return fantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }
    //SET
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setTipoPessoaid(int tipoPessoaid) {
        TipoPessoaid = tipoPessoaid;


    }
}
