package model;

public class Fornecedor {
    private int id;
    private String razaosocial;
    private String fantasia;
    private String cnpj;
    private int tipoPessoaId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setRazaosocial(String razaosocial){
        this.razaosocial = razaosocial;
    }
    public String getRazaosocial(){
    	return razaosocial;
    }
    public String getFantasia(){
        return fantasia;
    }
    public void setFantasia(String fantasia){
        this.fantasia = fantasia;
    }
    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public int getTipoPessoaId(){
        return tipoPessoaId;
    }
    public void setTipoPessoaId(int tipoPessoaId){
        this.tipoPessoaId = tipoPessoaId;
    }
}
