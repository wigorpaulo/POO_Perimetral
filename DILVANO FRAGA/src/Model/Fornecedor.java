package Model;

public class Fornecedor{
    public int id;
    public String razaoSocial;
    public String cnpj;
    public int tipoPessoaId;
    public String fantasia;

    //GET
    public String getRazaosocial(){
        return razaoSocial;
    }
    public String getcnpj(){
        return cnpj;
    }
    public int getTipoPessoaid(){
        return tipoPessoaId;
    }
    public String getFantasia(){
        return fantasia;
    }

    //SET 
    public void setRazaosocial(String razaosocial){
        this.razaoSocial = razaosocial;
    }
    public void setcnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public void setTipoPessoaid(int tipopessoa){
        this.tipoPessoaId = tipopessoa;
    }
    public void setFantasia(String fantasia){
        this.fantasia = fantasia;
    }
}
